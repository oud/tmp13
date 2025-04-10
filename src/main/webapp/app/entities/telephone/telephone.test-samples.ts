import dayjs from 'dayjs/esm';

import { ITelephone, NewTelephone } from './telephone.model';

export const sampleWithRequiredData: ITelephone = {
  id: '4b43329f-1207-47b7-92d1-756c7a83b74d',
  codePaysISO: 'that',
  codeTypeTelephone: 'despite outrun tooth',
  dateDerniereModification: dayjs('2025-04-09'),
  codeIndicatifPays: 'louse',
  numeroTelephone: 'married alongside',
  codeStatut: 'for pfft',
  dateStatut: 'dimly absent',
  codeUsageTelephone: 'rosy',
};

export const sampleWithPartialData: ITelephone = {
  id: '778686f8-0953-40b0-9c54-35d3fbab46aa',
  codePaysISO: 'orientate gracious strange',
  codeTypeTelephone: 'drat uh-huh',
  dateDerniereModification: dayjs('2025-04-09'),
  codeIndicatifPays: 'before',
  numeroTelephone: 'conservation whereas',
  codeStatut: 'yet',
  dateStatut: 'but',
  codeUsageTelephone: 'moral',
};

export const sampleWithFullData: ITelephone = {
  id: '753856cd-d4b3-4fe4-b278-af5a873e5c0e',
  codePaysISO: 'hmph',
  codeTypeTelephone: 'bah repeatedly',
  dateDerniereModification: dayjs('2025-04-10'),
  codeIndicatifPays: 'profane merrily fearless',
  numeroTelephone: 'pfft',
  codeStatut: 'suspiciously',
  dateStatut: 'understated',
  codeUsageTelephone: 'yowza',
};

export const sampleWithNewData: NewTelephone = {
  codePaysISO: 'willfully because',
  codeTypeTelephone: 'meal',
  dateDerniereModification: dayjs('2025-04-10'),
  codeIndicatifPays: 'times qua',
  numeroTelephone: 'furthermore',
  codeStatut: 'whether',
  dateStatut: 'between legal',
  codeUsageTelephone: 'wherever',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
