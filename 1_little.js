import http from 'k6/http'

import {sleep} from 'k6'

export const options = {
	duration: 60000,
	vus: 1
};

export default function(){
	http.get("http://api:8080/ba2api/data/10");
}
