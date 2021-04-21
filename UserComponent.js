import React from 'react';
import UserService from '../services/UserService';



class UserComponent extends React.Component{
    constructor(props){
        super(props)
        this.state ={
            users:[]
        }
    }

    componentDidMount(){
        UserService.getUsers().then((response) => {
            this.setState({ users: response.data})
        });
    }
    render (){
        return(
            <div>
              <h1 color="blue" className ="text-center">Atos Syntel Employee Data</h1>
              <table className ="table table-stripped">
                  <thead>
                      <tr>
                          <td>Employee Id</td>
                          <td>First Name</td>
                          <td>Last Name</td>
                          <td>Employee Email Id</td>
                          <td>Position</td>
                          <td>Department</td>
                      </tr>
                  </thead>
                  <tbody>
                      {
                          this.state.users.map(
                              user=>
                              <tr key={user.id}>
                                  <td>{user.id}</td>
                                  <td>{user.firstName}</td>
                                  <td>{user.lastName}</td>
                                  <td>{user.email}</td>
                                  <td>{user.position}</td>
                                  <td>{user.department}</td>
                              </tr>
                          )
                      }
                  </tbody>
              </table>
            </div>
        )
    }
}
export default UserComponent;