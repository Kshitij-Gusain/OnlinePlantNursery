import React, { Component } from 'react'
import SeedService from '../services/SeedService';

class CreateSeedComponent extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            seedId: '',
            commonName: '',
            bloomTime: '',
            watering: '',
            difficultyLevel: '',
            temparature: '',
            typeOfSeeds: '',
            seedsDescription: '',
            seedsStock: '',
            seedsCost: '',
            seedsPerPacket: '',

        }

        this.updateSeed = this.updateSeed.bind(this);
        this.changeIDHandler = this.changeIDHandler.bind(this);
        this.changeCommonNameHandler = this.changeCommonNameHandler.bind(this);
        this.changeBloomTimeHandler = this.changeBloomTimeHandler.bind(this);
        this.changeWateringHandler = this.changeWateringHandler.bind(this);
        this.changeDifficultyLevelHandler = this.changeDifficultyLevelHandler.bind(this);
        this.changeTemperatureHandler = this.changeTemperatureHandler.bind(this);
        this.changeTypeOfSeedHandler = this.changeTypeOfSeedHandler.bind(this);
        this.changeSeedDescriptionHandler = this.changeSeedDescriptionHandler.bind(this);
        this.changeSeedsStockHandler = this.changeSeedsStockHandler.bind(this);
        this.changeSeedCostHandler = this.changeSeedCostHandler.bind(this);
        this.changeSeedsPerPacketHandler = this.changeSeedsPerPacketHandler.bind(this);
    }

    cancel() {
        this.props.history.push('/viewseed');
    }

    updateSeed = (e) => {
        e.preventDefault();
        let seed = {seedId: this.state.seedId, commonName: this.state.commonName, bloomTime: this.state.bloomTime, watering: this.state.watering, difficultyLevel: this.state.difficultyLevel, temparature: this.state.temparature, typeOfSeeds: this.state.typeOfSeeds, seedsDescription: this.state.seedsDescription, seedsStock: this.state.seedsStock, seedsCost: this.state.seedsCost, seedsPerPacket: this.state.seedsPerPacket }
        console.log('seed =>' + JSON.stringify(seed));

        SeedService.updateSeed(seed).then(response => {
            this.props.history.push('/viewseed')
        })
    }
    
    changeIDHandler = (event) => {
        this.setState({seedId: event.target.value})
    }

    changeCommonNameHandler = (event) => {
        this.setState({commonName: event.target.value})
    }

    changeBloomTimeHandler = (event) => {
        this.setState({bloomTime: event.target.value})
    }

    changeWateringHandler = (event) => {
        this.setState({watering: event.target.value})
    }

    changeDifficultyLevelHandler = (event) => {
        this.setState({difficultyLevel: event.target.value})
    }

    changeTemperatureHandler = (event) => {
        this.setState({temparature: event.target.value})
    }

    changeTypeOfSeedHandler = (event) => {
        this.setState({typeOfSeeds: event.target.value})
    }

    changeSeedDescriptionHandler = (event) => {
        this.setState({seedsDescription: event.target.value})
    }

    changeSeedsStockHandler = (event) => {
        this.setState({seedsStock: event.target.value})
    }

    changeSeedCostHandler = (event) => {
        this.setState({seedsCost: event.target.value})
    }

    changeSeedsPerPacketHandler = (event) => {
        this.setState({seedsPerPacket: event.target.value})
    }

    render() {
        return (
            <div>
                <div className = "container">
                    <div className = "row">
                        <div className = "card col-md-6 offset-md-3 offset-md-3">
                            <h3 className="text-center">Update Seed</h3>
                            <div className="card-body">
                                <form>
                                   <div className = "form-group">
                                        <label>Seed ID</label>
                                        <input placeholder="Seed ID" name="seedId" className="form-control" 
                                        value={this.state.seedId} onChange={this.changeIDHandler} />
                                        <label>Common Name</label>
                                        <input placeholder="Common Name" name="commonName" className="form-control" 
                                        value={this.state.commonName} onChange={this.changeCommonNameHandler} />
                                        <label>Bloom Time</label>
                                        <input placeholder= "Bloom Time" name="bloomTime" className="form-control" 
                                        value={this.state.bloomTime} onChange={this.changeBloomTimeHandler} />
                                        <label>Watering</label>
                                        <input placeholder="Watering" name="watering" className="form-control" 
                                        value={this.state.watering} onChange={this.changeWateringHandler} />
                                        <label>Difficulty Level</label>
                                        <input placeholder="Difficulty Level" name="difficultyLevel" className="form-control" 
                                        value={this.state.difficultyLevel} onChange={this.changeDifficultyLevelHandler} />
                                        <label>Temperature</label>
                                        <input placeholder="Temperature" name="temparature" className="form-control" 
                                        value={this.state.temparature} onChange={this.changeTemperatureHandler} />
                                        <label>Type Of Seeds</label>
                                        <input placeholder="Type Of Seeds" name="typeOfSeeds" className="form-control" 
                                        value={this.state.typeOfSeeds} onChange={this.changeTypeOfSeedHandler} />
                                        <label>Seeds Description</label>
                                        <input placeholder="Difficulty Level" name="seedsDescription" className="form-control" 
                                        value={this.state.seedsDescription} onChange={this.changeSeedDescriptionHandler} />
                                        <label>Seed Stock</label>
                                        <input placeholder="Seeds Stock" name="seedsStock" className="form-control" 
                                        value={this.state.seedsStock} onChange={this.changeSeedsStockHandler} />
                                        <label>Seed Cost</label>
                                        <input placeholder="Seed Cost" name="seedsCost" className="form-control" 
                                        value={this.state.seedsCost} onChange={this.changeSeedCostHandler} />
                                        <label>Seeds Per Packet</label>
                                        <input placeholder="Seeds Per Packet" name="seedsPerPacket" className="form-control" 
                                        value={this.state.seedsPerPacket} onChange={this.changeSeedsPerPacketHandler} />

                                        <button className="btn btn-success" onClick={this.updateSeed}>Update</button>
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

export default CreateSeedComponent