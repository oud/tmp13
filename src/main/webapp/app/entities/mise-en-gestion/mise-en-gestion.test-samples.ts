import dayjs from 'dayjs/esm';

import { IMiseEnGestion, NewMiseEnGestion } from './mise-en-gestion.model';

export const sampleWithRequiredData: IMiseEnGestion = {
  id: '7649b640-31dd-49b4-9bb2-dbc558d30f67',
  typeMEG: 'sonata',
  codeOffre: 'second',
  dateEffet: dayjs('2025-04-09'),
};

export const sampleWithPartialData: IMiseEnGestion = {
  id: '16d14af0-0d0e-4caa-929a-cd65e0bff9f1',
  typeMEG: 'than',
  codeOffre: 'fundraising valiantly',
  dateEffet: dayjs('2025-04-09'),
};

export const sampleWithFullData: IMiseEnGestion = {
  id: '6b10819f-9ad8-475d-a6c1-e57e322e68d2',
  typeMEG: 'ew ouch',
  codeOffre: 'queasy',
  dateEffet: dayjs('2025-04-09'),
};

export const sampleWithNewData: NewMiseEnGestion = {
  typeMEG: 'why',
  codeOffre: 'so controvert',
  dateEffet: dayjs('2025-04-09'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
