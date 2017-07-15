import {Routes,RouterModule} from '@angular/router';
import { NgModule } from '@angular/core';
import { MainComponent } from './main/main.component';
import { MainModule } from './main/main.module';
import { AuthGuard } from './common/auth-guard';
const routes:Routes=[
    { path: '', loadChildren: './main/main.module#MainModule',canActivate:[AuthGuard] },
    { path: 'login', loadChildren: './login/login.module#LoginModule'}
    
]

@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{}