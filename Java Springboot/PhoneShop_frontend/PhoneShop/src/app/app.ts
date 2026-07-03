import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('PhoneShop');

  onSubmit(event: Event, value: string) {
    event.preventDefault();
    console.log('Submitted text:', value);
  }
}
