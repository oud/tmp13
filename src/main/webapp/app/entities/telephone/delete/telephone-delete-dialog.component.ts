import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

import SharedModule from 'app/shared/shared.module';
import { ITEM_DELETED_EVENT } from 'app/config/navigation.constants';
import { ITelephone } from '../telephone.model';
import { TelephoneService } from '../service/telephone.service';

@Component({
  templateUrl: './telephone-delete-dialog.component.html',
  imports: [SharedModule, FormsModule],
})
export class TelephoneDeleteDialogComponent {
  telephone?: ITelephone;

  protected telephoneService = inject(TelephoneService);
  protected activeModal = inject(NgbActiveModal);

  cancel(): void {
    this.activeModal.dismiss();
  }

  confirmDelete(id: string): void {
    this.telephoneService.delete(id).subscribe(() => {
      this.activeModal.close(ITEM_DELETED_EVENT);
    });
  }
}
