import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { MODULE_COMPONENTS, MODULE_ROUTES } from './dashboard.routes';
import { LibraryModule } from '../library/library.module';

@NgModule({
    imports: [
        RouterModule.forChild(MODULE_ROUTES),
        LibraryModule
    ],
    declarations: [ MODULE_COMPONENTS ]
})

export class DashboardModule{}
