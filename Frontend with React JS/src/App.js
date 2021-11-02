import React, {useState} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import PlantListComponent from './components/PlantListComponent';
import SeedListComponent from './components/SeedListComponent';
import HeaderComponent from './components/HeaderComponent';
import CreatePlantComponent from './components/CreatePlantComponent';
import UpdatePlantComponent from './components/UpdatePlantComponent';
import CreateSeedComponent from './components/CreateSeedComponent';
import UpdateSeedComponent from './components/UpdateSeedComponent';
import Dashboard from './components/Dashboard';
import LoginForm from './components/LoginForm';

function App() {

  const adminUser = {
    email: "admin@admin.com",
    password: "pass123"
  }

  const[user, setUser] = useState({name: "", email: ""});
  const [error, setError] = useState("");

  const Login = details => {
    console.log(details);

    if(details.email == adminUser.email && details.password == adminUser.password) {
      console.log("Logged In");
      setUser({
        name: details.name,
        email: details.email
      });
    } else {
      console.log("Details do not match!");
      setError("Details do not match!");
    }
  }

  const Logout = () => {
    setUser({ name: "", email: ""});
  }

  return (
    <div>
      {(user.email != "") ? (
        <div>
        <Router>
          <HeaderComponent /><button onClick={Logout}>Logout</button>
            <div className="container">
              <Switch>
                <Route path = "/" exact component = {Dashboard}></Route>
                
                <Route path = "/viewplant" component = {PlantListComponent}></Route>
                <Route path = "/addplant" component = {CreatePlantComponent}></Route>
                <Route path = "/updateplant/:id" component = {UpdatePlantComponent}></Route>

                <Route path = "/viewseed" component = {SeedListComponent}></Route>
                <Route path = "/addseed" component = {CreateSeedComponent}></Route>
                <Route path = "/updateseed/:id" component = {UpdateSeedComponent}></Route>
              </Switch>
            </div>
        </Router>
        </div>
      ) : (
        <LoginForm Login={Login} error={error} />
      )}  
    </div>
  );
}

export default App;
