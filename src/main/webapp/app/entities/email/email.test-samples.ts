import dayjs from 'dayjs/esm';

import { IEmail, NewEmail } from './email.model';

export const sampleWithRequiredData: IEmail = {
  id: '3b571c7e-0ff7-4521-9425-bd8b0874cc6e',
  adresseEmail: 'meanwhile',
  codeStatut: 'properly muffled bidet',
  dateStatut: dayjs('2025-04-09'),
  codeUsageEmail: 'upliftingly',
};

export const sampleWithPartialData: IEmail = {
  id: '54efe56f-9bbc-405c-97f3-17801c7623ec',
  adresseEmail: 'who',
  codeStatut: 'where',
  dateStatut: dayjs('2025-04-10'),
  codeUsageEmail: 'characterization',
};

export const sampleWithFullData: IEmail = {
  id: '1989369f-020c-4d22-9235-8c082237de01',
  adresseEmail: 'ajar psst',
  codeStatut: 'within behind',
  dateStatut: dayjs('2025-04-09'),
  codeUsageEmail: 'slimy',
};

export const sampleWithNewData: NewEmail = {
  adresseEmail: 'lucky amidst',
  codeStatut: 'needily',
  dateStatut: dayjs('2025-04-09'),
  codeUsageEmail: 'pull',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
