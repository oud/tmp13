import dayjs from 'dayjs/esm';

import { IAdresse, NewAdresse } from './adresse.model';

export const sampleWithRequiredData: IAdresse = {
  id: '57bfb5ef-bb30-46c3-8210-c02f1838bb0c',
  codePaysISO: 'eggplant habit',
  codePostal: 'incidentally gosh',
  dateDerniereModification: dayjs('2025-04-09'),
  libelleCommune: 'bonfire meanwhile',
  ligne1: 'wherever eek',
  ligne2: 'athwart courageously male',
  ligne3: 'newsstand',
  ligne4: 'foolish',
  ligne5: 'towards obligation',
  ligne6: 'cruelly kit',
  ligne7: 'astonishing as lest',
  nombreCourriersPND: 'anti',
  codeUsageAdresse: 'after',
};

export const sampleWithPartialData: IAdresse = {
  id: '60aa680d-e70f-4f47-9de3-f0b3ee96d1dc',
  codePaysISO: 'athwart',
  codePostal: 'since acidly',
  dateDerniereModification: dayjs('2025-04-09'),
  libelleCommune: 'um worthwhile',
  ligne1: 'enchanting',
  ligne2: 'duh inasmuch',
  ligne3: 'kooky',
  ligne4: 'under',
  ligne5: 'ah ferociously sans',
  ligne6: 'brr',
  ligne7: 'vice catalyst',
  nombreCourriersPND: 'unlike meatloaf certify',
  codeUsageAdresse: 'congregate lest incidentally',
};

export const sampleWithFullData: IAdresse = {
  id: 'f574e952-435e-4513-a48a-cbb595d65099',
  codePaysISO: 'given through concerned',
  codePostal: 'past',
  dateDerniereModification: dayjs('2025-04-09'),
  libelleCommune: 'athwart less knight',
  ligne1: 'impact lest outrageous',
  ligne2: 'expostulate',
  ligne3: 'fuzzy legitimize yippee',
  ligne4: 'notwithstanding',
  ligne5: 'with beloved gosh',
  ligne6: 'pneumonia',
  ligne7: 'moisten velocity victoriously',
  nombreCourriersPND: 'uh-huh large fledgling',
  codeUsageAdresse: 'championship gadzooks gadzooks',
};

export const sampleWithNewData: NewAdresse = {
  codePaysISO: 'timely',
  codePostal: 'shocked instruction',
  dateDerniereModification: dayjs('2025-04-09'),
  libelleCommune: 'equally whereas',
  ligne1: 'republican and',
  ligne2: 'develop',
  ligne3: 'ah ew mid',
  ligne4: 'queasy however publication',
  ligne5: 'truly',
  ligne6: 'wonderfully extricate',
  ligne7: 'spice',
  nombreCourriersPND: 'until',
  codeUsageAdresse: 'vaguely optimistically nasalise',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
