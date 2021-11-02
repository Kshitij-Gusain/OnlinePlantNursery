import axios from 'axios';

const PLANT_API_GET_URL = "http://localhost:8080/plantinfo/viewplant"
const PLANT_API_POST_URL = "http://localhost:8080/plantinfo/addplant"
const PLANT_API_PUT_URL = "http://localhost:8080/plantinfo/updateplant"
const PLANT_API_DELETE_URL = "http://localhost:8080/plantinfo/deleteplantbyid"

class PlantService {

    getPlants() {
        return axios.get(PLANT_API_GET_URL);
    }

    createPlant(plant) {
        return axios.post(PLANT_API_POST_URL, plant);
    }

    updatePlant(plant) {
        return axios.put(PLANT_API_PUT_URL, plant);
    }

    deletePlant(plantId) {
        return axios.delete(PLANT_API_DELETE_URL + '/' + plantId);
    }
}

export default new PlantService()