import React, { Component } from 'react'
import PlantService from '../services/PlantService'

class PlantListComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            plants: []
        }
        this.addPlant = this.addPlant.bind(this)
        this.editPlant = this.editPlant.bind(this)
        this.deletePlant = this.deletePlant.bind(this)
    }

    editPlant(id) {
        this.props.history.push(`/updateplant/${id}`)
    }

    deletePlant(id) {
        PlantService.deletePlant(id).then( response => {
            this.setState({
                plants: this.state.plants.filter(plant => plant.plantId !== id)
            });
        });
    }

    componentDidMount() {
        PlantService.getPlants().then((response) => {
           this.setState({
               plants: response.data
           }) 
        })
    }

    addPlant() {
        this.props.history.push('/addplant')
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Plant List</h2>
                <div className="row">
                    <button className="btn btn-primary" onClick={this.addPlant}>Add Plant</button>
                </div>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Height</th>
                                <th>Spread</th>
                                <th>Common Name</th>
                                <th>Bloom Time</th>
                                <th>Culinary or Medicinal Use</th>
                                <th>Difficulty Level</th>
                                <th>Temperature</th>
                                <th>Type</th>
                                <th>Description</th>
                                <th>Stock</th>
                                <th>Cost</th>
                                <th>Actions</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.plants.map(
                                    plant => 
                                    <tr key = {plant.plantId}>
                                        <td>{plant.plantId}</td>
                                        <td>{plant.plantHeight}</td>
                                        <td>{plant.plantSpread}</td>
                                        <td>{plant.commonName}</td>
                                        <td>{plant.bloomTime}</td>
                                        <td>{plant.medicinalOrCulinaryUse}</td>
                                        <td>{plant.difficultyLevel}</td>
                                        <td>{plant.temparature}</td>
                                        <td>{plant.typeOfPlant}</td>
                                        <td>{plant.plantDescription}</td>
                                        <td>{plant.plantsStock}</td>
                                        <td>{plant.plantCost}</td>
                                        <td>
                                            <button onClick = { () => this.editPlant(plant.plantId)} className="btn btn-info">Update</button>
                                            <button onClick = { () => this.deletePlant(plant.plantId)} className="btn btn-danger">Delete </button>
                                        </td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}

export default PlantListComponent
