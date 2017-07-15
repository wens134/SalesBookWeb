import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PanelComponent } from './panel.component';
import { MdInputModule } from '@angular/material';

@NgModule({
  imports: [
    CommonModule,
    MdInputModule
  ],
  exports:[
    PanelComponent
  ],
  declarations: [PanelComponent]
})
export class PanelModule { }
