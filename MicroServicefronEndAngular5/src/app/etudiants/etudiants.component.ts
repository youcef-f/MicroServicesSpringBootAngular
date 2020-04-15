import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Component({
  selector: "app-etudiants",
  // tslint:disable-next-line: indent
  templateUrl: "./etudiants.component.html",
  styleUrls: ["./etudiants.component.css"],
})
export class EtudiantsComponent implements OnInit {
  email: String = "me@youssfi.net";

  constructor(private httpClient: HttpClient) {}

  listFormations: any;
  listEtudiantofFormation: any;
  currentFormation: any;



  ngOnInit() {

	this.currentFormation = { id: -1 };

    this.httpClient.get("http://localhost:8080/datarest/formations").subscribe(
      (data) => {
        this.listFormations = data;
      },
      (err) => {
        console.log(err);
      }
    );
  }

  onGetEudiants(formation: any) {
    this.currentFormation = formation;
    this.httpClient
      .get(
        "http://localhost:8080/datarest/formations/" +
          formation.id +
          "/etudiants"
      )
      .subscribe(
        (data) => {
          this.listEtudiantofFormation = data;
        },
        (err) => {
          console.log(err);
        }
      );
  }
}
