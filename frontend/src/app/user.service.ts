import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { User } from "./user";
import { HttpClient } from "@angular/common/http";
@Injectable({
    providedIn:'root'
})

export class UserService {
private apiServerUrl = '';

constructor(private http: HttpClient) {}

public getUsers(): Observable<User[]> {
    return this.http.get<User[]>(`${this.apiServerUrl}/users`);
}

public addUser(user: User): Observable<User> {
    return this.http.post<User[]>(`${this.apiServerUrl}/user/save`, user);
}

}