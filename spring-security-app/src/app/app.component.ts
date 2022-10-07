import { PlayerService } from './services/player.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'spring-security-app';

   constructor(private playerService:PlayerService){
    this.ngOnInit();
   }

   ngOnInit(){
     this.playerService.getPlayers().subscribe(
      data =>{

      }
     )
   }




}
