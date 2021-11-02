import axios from 'axios';

const SEED_API_GET_URL = "http://localhost:8080/seedinfo/viewseed"
const SEED_API_POST_URL = "http://localhost:8080/seedinfo/addseed"
const SEED_API_PUT_URL = "http://localhost:8080/seedinfo/updateseed"
const SEED_API_DELETE_URL = "http://localhost:8080/seedinfo/deleteseedbyid"

class SeedService {

    getSeeds() {
        return axios.get(SEED_API_GET_URL);
    }

    createSeed(seed) {
        return axios.post(SEED_API_POST_URL, seed);
    }

    updateSeed(seed) {
        return axios.put(SEED_API_PUT_URL, seed);
    }

    deleteSeed(seedId) {
        return axios.delete(SEED_API_DELETE_URL + '/' + seedId);
    }
}

export default new SeedService()