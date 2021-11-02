import React, { Component } from 'react'
import SeedService from '../services/SeedService'

class SeedListComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            seeds: []
        }
        this.addSeed = this.addSeed.bind(this)
        this.editSeed = this.editSeed.bind(this)
        this.deleteSeed = this.deleteSeed.bind(this)
    }

    editSeed(id) {
        this.props.history.push(`/updateseed/${id}`)
    }

    deleteSeed(id) {
        SeedService.deleteSeed(id).then( response => {
            this.setState({
                seeds: this.state.seeds.filter(seed => seed.seedId !== id)
            });
        });
    }

    componentDidMount() {
        SeedService.getSeeds().then( (response) => {
           this.setState({
               seeds: response.data
           }) 
        })
    }

    addSeed() {
        this.props.history.push('/addseed')
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Seed List</h2>
                <div className="row">
                    <button className="btn btn-primary" onClick={this.addSeed}>Add Seed</button>
                </div>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Common Name</th>
                                <th>Bloom Time</th>
                                <th>Watering</th>
                                <th>Difficulty Level</th>
                                <th>Temperature</th>
                                <th>Type</th>
                                <th>Description</th>
                                <th>Stock</th>
                                <th>Cost</th>
                                <th>Seeds Per Packet</th>
                                <th>Actions</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.seeds.map(
                                    seed => 
                                    <tr key = {seed.seedId}>
                                        <td>{seed.seedId}</td>
                                        <td>{seed.commonName}</td>
                                        <td>{seed.bloomTime}</td>
                                        <td>{seed.watering}</td>
                                        <td>{seed.difficultyLevel}</td>
                                        <td>{seed.temparature}</td>         
                                        <td>{seed.typeOfSeeds}</td>
                                        <td>{seed.seedsDescription}</td>
                                        <td>{seed.seedsStock}</td>
                                        <td>{seed.seedsCost}</td>
                                        <td>{seed.seedsPerPacket}</td>
                                        <td>
                                            <button onClick = { () => this.editSeed(seed.seedId)} className="btn btn-info">Update</button>
                                            <button onClick = { () => this.deleteSeed(seed.seedId)} className="btn btn-danger">Delete </button>
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

export default SeedListComponent
