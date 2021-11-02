import React, { Component } from 'react'
import PlantService from '../services/PlantService';

class UpdatePlantComponent extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            plantId: '',
            plantHeight: '',
            plantSpread: '',
            commonName: '',
            bloomTime: '',
            medicinalOrCulinaryUse: '',
            difficultyLevel: '',
            temparature: '',
            typeOfPlant: '',
            plantDescription: '',
            plantsStock: '',
            plantCost: '',

        }

        this.updatePlant = this.updatePlant.bind(this);
        this.changeIDHandler = this.changeIDHandler.bind(this);
        this.changeHeightHandler = this.changeHeightHandler.bind(this);
        this.changeSpreadHandler = this.changeSpreadHandler.bind(this);
        this.changeCommonNameHandler = this.changeCommonNameHandler.bind(this);
        this.changeBloomTimeHandler = this.changeBloomTimeHandler.bind(this);
        this.changeMcHandler = this.changeMcHandler.bind(this);
        this.changeDifficultyLevelHandler = this.changeDifficultyLevelHandler.bind(this);
        this.changeTemperatureHandler = this.changeTemperatureHandler.bind(this);
        this.changeTypeOfPlantHandler = this.changeTypeOfPlantHandler.bind(this);
        this.changePlantDescriptionHandler = this.changePlantDescriptionHandler.bind(this);
        this.changePlantsStockHandler = this.changePlantsStockHandler.bind(this);
        this.changePlantCostHandler = this.changePlantCostHandler.bind(this);
    }

    cancel() {
        this.props.history.push('/viewplant');
    }


    updatePlant = (e) => {
        e.preventDefault();
        let plant = {plantId: this.state.plantId, plantHeight: this.state.plantHeight, plantSpread: this.state.plantSpread, commonName: this.state.commonName, bloomTime: this.state.bloomTime, medicinalOrCulinaryUse: this.state.medicinalOrCulinaryUse, difficultyLevel: this.state.difficultyLevel, temparature: this.state.temparature, typeOfPlant: this.state.typeOfPlant, plantDescription: this.state.plantDescription, plantsStock: this.state.plantsStock, plantCost: this.state.plantCost}
        console.log('plant =>' + JSON.stringify(plant));

        PlantService.updatePlant(plant).then( response => {
            this.props.history.push('/viewplant')
        })
    }
    
    changeIDHandler = (event) => {
        this.setState({plantId: event.target.value})
    }

    changeHeightHandler = (event) => {
        this.setState({plantHeight: event.target.value})
    }

    changeSpreadHandler = (event) => {
        this.setState({plantSpread: event.target.value})
    }

    changeCommonNameHandler = (event) => {
        this.setState({commonName: event.target.value})
    }

    changeBloomTimeHandler = (event) => {
        this.setState({bloomTime: event.target.value})
    }

    changeMcHandler = (event) => {
        this.setState({medicinalOrCulinaryUse: event.target.value})
    }

    changeDifficultyLevelHandler = (event) => {
        this.setState({difficultyLevel: event.target.value})
    }

    changeTemperatureHandler = (event) => {
        this.setState({temparature: event.target.value})
    }

    changeTypeOfPlantHandler = (event) => {
        this.setState({typeOfPlant: event.target.value})
    }

    changePlantDescriptionHandler = (event) => {
        this.setState({plantDescription: event.target.value})
    }

    changePlantsStockHandler = (event) => {
        this.setState({plantsStock: event.target.value})
    }

    changePlantCostHandler = (event) => {
        this.setState({plantCost: event.target.value})
    }

    render() {
        return (
            <div>
                <div className = "container">
                    <div className = "row">
                        <div className = "card col-md-6 offset-md-3 offset-md-3">
                            <h3 className="text-center">Update Plant</h3>
                            <div className="card-body">
                                <form>
                                   <div className = "form-group">
                                        <label>Plant ID</label>
                                        <input placeholder="Plant ID" name="plantId" className="form-control" 
                                        value={this.state.plantId} onChange={this.changeIDHandler} />
                                        <label>Plant Height</label>
                                        <input placeholder="Height" name="plantHeight" className="form-control" 
                                        value={this.state.plantHeight} onChange={this.changeHeightHandler} />
                                        <label>Plant Spread</label>
                                        <input placeholder="Plant Spread" name="plantSpread" className="form-control" 
                                        value={this.state.plantSpread} onChange={this.changeSpreadHandler} />
                                        <label>Common Name</label>
                                        <input placeholder="Common Name" name="commonName" className="form-control" 
                                        value={this.state.commonName} onChange={this.changeCommonNameHandler} />
                                        <label>Bloom Time</label>
                                        <input placeholder="Bloom Time" name="bloomTime" className="form-control" 
                                        value={this.state.bloomTime} onChange={this.changeBloomTimeHandler} />
                                        <label>Medicinal Or Culinary Use</label>
                                        <input placeholder="Medicinal/Culinary/Both/No" name="medicinalOrCulinaryUse" className="form-control" 
                                        value={this.state.medicinalOrCulinaryUse} onChange={this.changeMcHandler} />
                                        <label>Difficulty Level</label>
                                        <input placeholder="Difficulty Level" name="difficultyLevel" className="form-control" 
                                        value={this.state.difficultyLevel} onChange={this.changeDifficultyLevelHandler} />
                                        <label>Temperature</label>
                                        <input placeholder="Temperature" name="temparature" className="form-control" 
                                        value={this.state.temparature} onChange={this.changeTemperatureHandler} />
                                        <label>Type Of Plant</label>
                                        <input placeholder="Type Of Plant" name="typeOfPlant" className="form-control" 
                                        value={this.state.typeOfPlant} onChange={this.changeTypeOfPlantHandler} />
                                        <label>Plant Description</label>
                                        <input placeholder="Plant Description" name="plantDescription" className="form-control" 
                                        value={this.state.plantDescription} onChange={this.changePlantDescriptionHandler} />
                                        <label>Plants Stock</label>
                                        <input placeholder="Plants Stock" name="plantsStock" className="form-control" 
                                        value={this.state.plantsStock} onChange={this.changePlantsStockHandler} />
                                        <label>Plant Cost</label>
                                        <input placeholder="Plant Cost" name="plantCost" className="form-control" 
                                        value={this.state.plantCost} onChange={this.changePlantCostHandler} />

                                        <button className="btn btn-success" onClick={this.updatePlant}>Update</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                   </div>
                                </form>
                            </div>                      
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default UpdatePlantComponent
