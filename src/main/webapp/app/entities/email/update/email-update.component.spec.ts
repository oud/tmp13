import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpResponse, provideHttpClient } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Subject, from, of } from 'rxjs';

import { IPmEntreprise } from 'app/entities/pm-entreprise/pm-entreprise.model';
import { PmEntrepriseService } from 'app/entities/pm-entreprise/service/pm-entreprise.service';
import { IPmEtablissement } from 'app/entities/pm-etablissement/pm-etablissement.model';
import { PmEtablissementService } from 'app/entities/pm-etablissement/service/pm-etablissement.service';
import { IEmail } from '../email.model';
import { EmailService } from '../service/email.service';
import { EmailFormService } from './email-form.service';

import { EmailUpdateComponent } from './email-update.component';

describe('Email Management Update Component', () => {
  let comp: EmailUpdateComponent;
  let fixture: ComponentFixture<EmailUpdateComponent>;
  let activatedRoute: ActivatedRoute;
  let emailFormService: EmailFormService;
  let emailService: EmailService;
  let pmEntrepriseService: PmEntrepriseService;
  let pmEtablissementService: PmEtablissementService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [EmailUpdateComponent],
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
      .overrideTemplate(EmailUpdateComponent, '')
      .compileComponents();

    fixture = TestBed.createComponent(EmailUpdateComponent);
    activatedRoute = TestBed.inject(ActivatedRoute);
    emailFormService = TestBed.inject(EmailFormService);
    emailService = TestBed.inject(EmailService);
    pmEntrepriseService = TestBed.inject(PmEntrepriseService);
    pmEtablissementService = TestBed.inject(PmEtablissementService);

    comp = fixture.componentInstance;
  });

  describe('ngOnInit', () => {
    it('should call PmEntreprise query and add missing value', () => {
      const email: IEmail = { id: '5aaa2ce1-8db2-40c0-a28c-10fb47ecdd0c' };
      const pmEntreprise: IPmEntreprise = { id: '880bba1e-bb12-4c88-9b95-d5613c75d70c' };
      email.pmEntreprise = pmEntreprise;

      const pmEntrepriseCollection: IPmEntreprise[] = [{ id: '880bba1e-bb12-4c88-9b95-d5613c75d70c' }];
      jest.spyOn(pmEntrepriseService, 'query').mockReturnValue(of(new HttpResponse({ body: pmEntrepriseCollection })));
      const additionalPmEntreprises = [pmEntreprise];
      const expectedCollection: IPmEntreprise[] = [...additionalPmEntreprises, ...pmEntrepriseCollection];
      jest.spyOn(pmEntrepriseService, 'addPmEntrepriseToCollectionIfMissing').mockReturnValue(expectedCollection);

      activatedRoute.data = of({ email });
      comp.ngOnInit();

      expect(pmEntrepriseService.query).toHaveBeenCalled();
      expect(pmEntrepriseService.addPmEntrepriseToCollectionIfMissing).toHaveBeenCalledWith(
        pmEntrepriseCollection,
        ...additionalPmEntreprises.map(expect.objectContaining),
      );
      expect(comp.pmEntreprisesSharedCollection).toEqual(expectedCollection);
    });

    it('should call PmEtablissement query and add missing value', () => {
      const email: IEmail = { id: '5aaa2ce1-8db2-40c0-a28c-10fb47ecdd0c' };
      const pmEtablissement: IPmEtablissement = { id: '86096998-fd76-4295-bf45-d21d61001919' };
      email.pmEtablissement = pmEtablissement;

      const pmEtablissementCollection: IPmEtablissement[] = [{ id: '86096998-fd76-4295-bf45-d21d61001919' }];
      jest.spyOn(pmEtablissementService, 'query').mockReturnValue(of(new HttpResponse({ body: pmEtablissementCollection })));
      const additionalPmEtablissements = [pmEtablissement];
      const expectedCollection: IPmEtablissement[] = [...additionalPmEtablissements, ...pmEtablissementCollection];
      jest.spyOn(pmEtablissementService, 'addPmEtablissementToCollectionIfMissing').mockReturnValue(expectedCollection);

      activatedRoute.data = of({ email });
      comp.ngOnInit();

      expect(pmEtablissementService.query).toHaveBeenCalled();
      expect(pmEtablissementService.addPmEtablissementToCollectionIfMissing).toHaveBeenCalledWith(
        pmEtablissementCollection,
        ...additionalPmEtablissements.map(expect.objectContaining),
      );
      expect(comp.pmEtablissementsSharedCollection).toEqual(expectedCollection);
    });

    it('should update editForm', () => {
      const email: IEmail = { id: '5aaa2ce1-8db2-40c0-a28c-10fb47ecdd0c' };
      const pmEntreprise: IPmEntreprise = { id: '880bba1e-bb12-4c88-9b95-d5613c75d70c' };
      email.pmEntreprise = pmEntreprise;
      const pmEtablissement: IPmEtablissement = { id: '86096998-fd76-4295-bf45-d21d61001919' };
      email.pmEtablissement = pmEtablissement;

      activatedRoute.data = of({ email });
      comp.ngOnInit();

      expect(comp.pmEntreprisesSharedCollection).toContainEqual(pmEntreprise);
      expect(comp.pmEtablissementsSharedCollection).toContainEqual(pmEtablissement);
      expect(comp.email).toEqual(email);
    });
  });

  describe('save', () => {
    it('should call update service on save for existing entity', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IEmail>>();
      const email = { id: '9ee0421c-9d9f-49e3-920f-aed64422e065' };
      jest.spyOn(emailFormService, 'getEmail').mockReturnValue(email);
      jest.spyOn(emailService, 'update').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ email });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.next(new HttpResponse({ body: email }));
      saveSubject.complete();

      // THEN
      expect(emailFormService.getEmail).toHaveBeenCalled();
      expect(comp.previousState).toHaveBeenCalled();
      expect(emailService.update).toHaveBeenCalledWith(expect.objectContaining(email));
      expect(comp.isSaving).toEqual(false);
    });

    it('should call create service on save for new entity', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IEmail>>();
      const email = { id: '9ee0421c-9d9f-49e3-920f-aed64422e065' };
      jest.spyOn(emailFormService, 'getEmail').mockReturnValue({ id: null });
      jest.spyOn(emailService, 'create').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ email: null });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.next(new HttpResponse({ body: email }));
      saveSubject.complete();

      // THEN
      expect(emailFormService.getEmail).toHaveBeenCalled();
      expect(emailService.create).toHaveBeenCalled();
      expect(comp.isSaving).toEqual(false);
      expect(comp.previousState).toHaveBeenCalled();
    });

    it('should set isSaving to false on error', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IEmail>>();
      const email = { id: '9ee0421c-9d9f-49e3-920f-aed64422e065' };
      jest.spyOn(emailService, 'update').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ email });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.error('This is an error!');

      // THEN
      expect(emailService.update).toHaveBeenCalled();
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
