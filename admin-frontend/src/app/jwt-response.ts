export class JwtResponse {
    accessToken: string;
    type: string;
    username: string;
    authorities: string[];
    user_id: number;
}