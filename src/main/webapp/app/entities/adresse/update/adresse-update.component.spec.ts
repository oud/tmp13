import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpResponse, provideHttpClient } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Subject, from, of } from 'rxjs';

import { IPmEntreprise } from 'app/entities/pm-entreprise/pm-entreprise.model';
import { PmEntrepriseService } from 'app/entities/pm-entreprise/service/pm-entreprise.service';
import { IPmEtablissement } from 'app/entities/pm-etablissement/pm-etablissement.model';
import { PmEtablissementService } from 'app/entities/pm-etablissement/service/pm-etablissement.service';
import { IAdresse } from '../adresse.model';
import { AdresseService } from '../service/adresse.service';
import { AdresseFormService } from './adresse-form.service';

import { AdresseUpdateComponent } from './adresse-update.component';

describe('Adresse Management Update Component', () => {
  let comp: AdresseUpdateComponent;
  let fixture: ComponentFixture<AdresseUpdateComponent>;
  let activatedRoute: ActivatedRoute;
  let adresseFormService: AdresseFormService;
  let adresseService: AdresseService;
  let pmEntrepriseService: PmEntrepriseService;
  let pmEtablissementService: PmEtablissementService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [AdresseUpdateComponent],
      providers: [
        provideHttpClient(),
        FormBuilder,
        {
          provide: ActivatedRoute,
          useValue: {
            params: from([{}]),
          },
        },
      ],
    })
      .overrideTemplate(AdresseUpdateComponent, '')
      .compileComponents();

    fixture = TestBed.createComponent(AdresseUpdateComponent);
    activatedRoute = TestBed.inject(ActivatedRoute);
    adresseFormService = TestBed.inject(AdresseFormService);
    adresseService = TestBed.inject(AdresseService);
    pmEntrepriseService = TestBed.inject(PmEntrepriseService);
    pmEtablissementService = TestBed.inject(PmEtablissementService);

    comp = fixture.componentInstance;
  });

  describe('ngOnInit', () => {
    it('should call PmEntreprise query and add missing value', () => {
      const adresse: IAdresse = { id: '5dafc256-99f4-4911-91a7-b38458f0c79d' };
      const pmEntreprise: IPmEntreprise = { id: '880bba1e-bb12-4c88-9b95-d5613c75d70c' };
      adresse.pmEntreprise = pmEntreprise;

      const pmEntrepriseCollection: IPmEntreprise[] = [{ id: '880bba1e-bb12-4c88-9b95-d5613c75d70c' }];
      jest.spyOn(pmEntrepriseService, 'query').mockReturnValue(of(new HttpResponse({ body: pmEntrepriseCollection })));
      const additionalPmEntreprises = [pmEntreprise];
      const expectedCollection: IPmEntreprise[] = [...additionalPmEntreprises, ...pmEntrepriseCollection];
      jest.spyOn(pmEntrepriseService, 'addPmEntrepriseToCollectionIfMissing').mockReturnValue(expectedCollection);

      activatedRoute.data = of({ adresse });
      comp.ngOnInit();

      expect(pmEntrepriseService.query).toHaveBeenCalled();
      expect(pmEntrepriseService.addPmEntrepriseToCollectionIfMissing).toHaveBeenCalledWith(
        pmEntrepriseCollection,
        ...additionalPmEntreprises.map(expect.objectContaining),
      );
      expect(comp.pmEntreprisesSharedCollection).toEqual(expectedCollection);
    });

    it('should call PmEtablissement query and add missing value', () => {
      const adresse: IAdresse = { id: '5dafc256-99f4-4911-91a7-b38458f0c79d' };
      const pmEtablissement: IPmEtablissement = { id: '86096998-fd76-4295-bf45-d21d61001919' };
      adresse.pmEtablissement = pmEtablissement;

      const pmEtablissementCollection: IPmEtablissement[] = [{ id: '86096998-fd76-4295-bf45-d21d61001919' }];
      jest.spyOn(pmEtablissementService, 'query').mockReturnValue(of(new HttpResponse({ body: pmEtablissementCollection })));
      const additionalPmEtablissements = [pmEtablissement];
      const expectedCollection: IPmEtablissement[] = [...additionalPmEtablissements, ...pmEtablissementCollection];
      jest.spyOn(pmEtablissementService, 'addPmEtablissementToCollectionIfMissing').mockReturnValue(expectedCollection);

      activatedRoute.data = of({ adresse });
      comp.ngOnInit();

      expect(pmEtablissementService.query).toHaveBeenCalled();
      expect(pmEtablissementService.addPmEtablissementToCollectionIfMissing).toHaveBeenCalledWith(
        pmEtablissementCollection,
        ...additionalPmEtablissements.map(expect.objectContaining),
      );
      expect(comp.pmEtablissementsSharedCollection).toEqual(expectedCollection);
    });

    it('should update editForm', () => {
      const adresse: IAdresse = { id: '5dafc256-99f4-4911-91a7-b38458f0c79d' };
      const pmEntreprise: IPmEntreprise = { id: '880bba1e-bb12-4c88-9b95-d5613c75d70c' };
      adresse.pmEntreprise = pmEntreprise;
      const pmEtablissement: IPmEtablissement = { id: '86096998-fd76-4295-bf45-d21d61001919' };
      adresse.pmEtablissement = pmEtablissement;

      activatedRoute.data = of({ adresse });
      comp.ngOnInit();

      expect(comp.pmEntreprisesSharedCollection).toContainEqual(pmEntreprise);
      expect(comp.pmEtablissementsSharedCollection).toContainEqual(pmEtablissement);
      expect(comp.adresse).toEqual(adresse);
    });
  });

  describe('save', () => {
    it('should call update service on save for existing entity', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IAdresse>>();
      const adresse = { id: 'f8aa52d9-cf31-47aa-88cc-e8ed0ef692e0' };
      jest.spyOn(adresseFormService, 'getAdresse').mockReturnValue(adresse);
      jest.spyOn(adresseService, 'update').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ adresse });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.next(new HttpResponse({ body: adresse }));
      saveSubject.complete();

      // THEN
      expect(adresseFormService.getAdresse).toHaveBeenCalled();
      expect(comp.previousState).toHaveBeenCalled();
      expect(adresseService.update).toHaveBeenCalledWith(expect.objectContaining(adresse));
      expect(comp.isSaving).toEqual(false);
    });

    it('should call create service on save for new entity', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IAdresse>>();
      const adresse = { id: 'f8aa52d9-cf31-47aa-88cc-e8ed0ef692e0' };
      jest.spyOn(adresseFormService, 'getAdresse').mockReturnValue({ id: null });
      jest.spyOn(adresseService, 'create').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ adresse: null });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.next(new HttpResponse({ body: adresse }));
      saveSubject.complete();

      // THEN
      expect(adresseFormService.getAdresse).toHaveBeenCalled();
      expect(adresseService.create).toHaveBeenCalled();
      expect(comp.isSaving).toEqual(false);
      expect(comp.previousState).toHaveBeenCalled();
    });

    it('should set isSaving to false on error', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IAdresse>>();
      const adresse = { id: 'f8aa52d9-cf31-47aa-88cc-e8ed0ef692e0' };
      jest.spyOn(adresseService, 'update').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ adresse });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.error('This is an error!');

      // THEN
      expect(adresseService.update).toHaveBeenCalled();
      expect(comp.isSaving).toEqual(false);
      expect(comp.previousState).not.toHaveBeenCalled();
    });
  });

  describe('Compare relationships', () => {
    describe('comparePmEntreprise', () => {
      it('should forward to pmEntrepriseService', () => {
        const entity = { id: '880bba1e-bb12-4c88-9b95-d5613c75d70c' };
        const entity2 = { id: '7428260d-33fa-4f4b-8ca4-00e7a387d7a7' };
        jest.spyOn(pmEntrepriseService, 'comparePmEntreprise');
        comp.comparePmEntreprise(entity, entity2);
        expect(pmEntrepriseService.comparePmEntreprise).toHaveBeenCalledWith(entity, entity2);
      });
    });

    describe('comparePmEtablissement', () => {
      it('should forward to pmEtablissementService', () => {
        const entity = { id: '86096998-fd76-4295-bf45-d21d61001919' };
        const entity2 = { id: '2e45e341-6e4f-4aa4-9f20-f30827c7f085' };
        jest.spyOn(pmEtablissementService, 'comparePmEtablissement');
        comp.comparePmEtablissement(entity, entity2);
        expect(pmEtablissementService.comparePmEtablissement).toHaveBeenCalledWith(entity, entity2);
      });
    });
  });
});
