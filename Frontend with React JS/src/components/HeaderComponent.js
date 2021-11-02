import React, { Component } from 'react'
import { withRouter } from 'react-router-dom';

class HeaderComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {

        }
        this.handleClick = this.handleClick.bind(this);
    }
  
    handleClick(value) {
      this.props.history.push('/');
    }

    render() {
        return (
            <div>
                <header>
                    <nav className="navbar navbar-expand-md navbar-dark bg-dark">
                        <div>
                            <button className="navbar-brand" onClick={this.handleClick}>Online Plant Nursery App</button>
                        </div>
                    </nav>
                </header>
            </div>
        )
    }
}

export default withRouter(HeaderComponent)