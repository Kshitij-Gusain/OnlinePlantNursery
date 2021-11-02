import React, { Component } from 'react'

class Dashboard extends Component {
    render() {
      return (
        <div className="text-center">
            <div>
                <h1>Online Plant Nursery</h1>
                <p>A simple app for managing your plant nursery.</p>
                <form>
                <button className="btn btn-success" onClick={() => this.props.history.push('/viewplant')}>Manage Plants</button>
                <button style={{marginLeft: "10px"}} className="btn btn-success" onClick={() => this.props.history.push('/viewseed')}>Manage Seeds</button>
                </form>
            </div>
            <div>
                <img class="img-fluid" src="./nursery-image.jpg" height="500px" width="500px" />
            </div>
        </div>
      );
    }
}

export default Dashboard