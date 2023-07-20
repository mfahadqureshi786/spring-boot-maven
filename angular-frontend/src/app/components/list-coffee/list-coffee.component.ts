import { Component } from '@angular/core';
import { CoffeeService } from 'src/app/services/coffee.service';
import { Coffee } from 'src/app/models/coffee';
@Component({
  selector: 'app-list-coffee',
  templateUrl: './list-coffee.component.html',
  styleUrls: ['./list-coffee.component.css'],
  providers:[CoffeeService]
})
export class ListCoffeeComponent {
  coffeeServce:CoffeeService;
  coffeeList!:Coffee[];

  constructor(coffeeService:CoffeeService){
    this.coffeeServce = coffeeService;
  }
  ngOnInit(){
    this.coffeeServce.getAll().subscribe(data=>{
      this.coffeeList = data;
    });
  }
}
