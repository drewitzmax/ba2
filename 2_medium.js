import http from 'k6/http'

import {sleep} from 'k6'

export const options = {
	iterations: 100000,
};

export default function(){
	http.get("http://localhost:8082/ba2api/data/10000");
}
