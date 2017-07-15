import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MaterialModule} from '@angular/material';
import {AccordionModule,SharedModule} from 'primeng/primeng';     //accordion and accordion tab
import {MenuItem} from 'primeng/primeng'; 
import { HttpModule } from '@angular/http';
import { PanelModule } from '../panel/panel.module';
import { FormsModule, FormBuilder, ReactiveFormsModule  } from '@angular/forms';
import { AppCommonModule } from '../common/common.module';
import { AuthService } from '../service/auth.service';
import { ServiceModule } from '../service/service.module';


@NgModule({
  imports: [
    CommonModule,
    MaterialModule,
    AccordionModule,
    SharedModule,
    HttpModule,
    PanelModule,
    FormsModule,
    ServiceModule
  ],
  exports:[
    MaterialModule,
    AccordionModule,
    SharedModule,
    PanelModule,
    FormsModule,
    ReactiveFormsModule,
    AppCommonModule,
    ServiceModule
  ],
  providers: [
    FormBuilder,
  ]
})
export class LibraryModule { }
