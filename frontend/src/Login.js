import "./bootstrap.css";
import { useState } from "react";

function Login() {

    function handleClick() {
        const goToLink = 'https://www.google.com'; // Replace with your desired URL
        window.location.href = goToLink;
      }


  return (
    <div className="vh-100 gradient-custom">
      <div class="container-fluid h-100">
        <div class="d-flex justify-content-center align-items-center h-100">
          <div class="col-12 col-md-8 col-lg-6 col-xl-5">
            <div
              className="card bg-light text-black"
              style={{ borderRadius: "40px"}}
            >
              <div class="card-body p-5">
                <h2 class="fw-bold pb-2 text-uppercase text-black text-center">Login</h2>
                <p class="text-black text-center">
                  Please enter your login or <br class="d-md-none"></br><span  style={{ cursor: 'pointer'}} onClick={handleClick} data-href="http://google.com" class="border-bottom pb-0.5 border-dark">create a new account</span>
                </p>
                <form>
                  <fieldset>
                    <div class="form-group">
                      <label for="exampleInputEmail1" class="form-label mt-2 text-black">
                        Email address
                      </label>
                      <input
                        type="email"
                        class="form-control"
                        id="exampleInputEmail1"
                        aria-describedby="emailHelp"
                        placeholder="Enter email here"
                      />
                      <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else</small>
                    </div>
                    
                    <div class="form-group mt-4">
                      <label
                        for="exampleInputPassword1"
                        class="form-label text-black"
                      >
                        Password
                      </label>
                      <input
                        type="password"
                        class="form-control"
                        id="exampleInputPassword1"
                        placeholder="Enter password here"
                        autocomplete="off"
                      />
                    </div>
                  </fieldset>
                </form>
                <button type="button" class="btn btn-outline-success w-100 mt-4">Submit</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Login;
