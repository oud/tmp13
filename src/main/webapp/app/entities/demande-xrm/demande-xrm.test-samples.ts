import { IDemandeXRM, NewDemandeXRM } from './demande-xrm.model';

export const sampleWithRequiredData: IDemandeXRM = {
  id: 'bd3e8a79-a92d-4f06-8d78-cc7936a1c766',
};

export const sampleWithPartialData: IDemandeXRM = {
  id: '0e7c4215-ba7f-4dfe-a7ce-5513e88008bd',
};

export const sampleWithFullData: IDemandeXRM = {
  id: '8150c0c5-8b12-467a-991c-abc0f3ed15dc',
};

export const sampleWithNewData: NewDemandeXRM = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
