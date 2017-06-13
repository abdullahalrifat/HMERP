<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abdullah
  Date: 3/21/17
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">

<head>
    <title>Employees | Klorofil - Free Bootstrap Dashboard Template</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <!-- CSS -->
    <link rel="stylesheet" href="/resources/OtherHardCodedDesigns/InputFormDesign.css">
    <link rel="stylesheet" href="/resources/AdminPanel/template/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/AdminPanel/template/assets/css/vendor/icon-sets.css">
    <link rel="stylesheet" href="/resources/AdminPanel/template/assets/css/main.min.css">
    <!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
    <link rel="stylesheet" href="/resources/AdminPanel/template/assets/css/demo.css">
    <!-- GOOGLE FONTS -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
    <!-- ICONS -->
    <link rel="apple-touch-icon" sizes="76x76" href="/resources/AdminPanel/template/assets/img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="/resources/AdminPanel/template/assets/img/favicon.png">
    <!--JS
    <script type="text/javascript" src="/resources/OtherHardCodedJS/updateCustomer.js"></script>
        -->

</head>

<body >
<!-- WRAPPER -->
<div id="wrapper">
    <!-- SIDEBAR -->
    <div class="sidebar">
        <div class="brand">
            <a href="index.html"><img src="/resources/AdminPanel/template/assets/img/logo-rhivaan.png" alt="Klorofil Logo" class="img-responsive logo"></a>
        </div>
        <div class="sidebar-scroll">
            <nav>
                <ul class="nav">
                    <li><a href="index.html" class=""><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>
                    <li><a href="CustomersList.html" class="active"><i class="lnr lnr-employee"></i> <span>Customers</span></a></li>
                    <li><a href="ProductList.html" class=""><i class="lnr lnr-employee"></i> <span>Products</span></a></li>
                    <li><a href="PurchaseList.html" class=""><i class="lnr lnr-employee"></i> <span>Purchase</span></a></li>
                    <li><a href="SalesList.html" class=""><i class="lnr lnr-employee"></i> <span>Sales</span></a></li>
                    <li><a href="employees.html" class=""><i class="lnr lnr-employee"></i> <span>Employees</span></a></li>
                    <li><a href="projects.html" class=""><i class="lnr lnr-projects"></i> <span>Projects</span></a></li>
                    <li><a href="elements.html" class=""><i class="lnr lnr-code"></i> <span>Elements</span></a></li>
                    <li><a href="charts.html" class=""><i class="lnr lnr-chart-bars"></i> <span>Charts</span></a></li>
                    <li><a href="panels.html" class=""><i class="lnr lnr-cog"></i> <span>Panels</span></a></li>
                    <li><a href="notifications.html" class=""><i class="lnr lnr-alarm"></i> <span>Notifications</span></a></li>
                    <li>
                        <a href="#subPages" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i> <span>Pages</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages" class="collapse ">
                            <ul class="nav">
                                <li><a href="page-profile.html" class="">Profile</a></li>
                                <li><a href="page-login.html" class="">Login</a></li>
                                <li><a href="page-lockscreen.html" class="">Lockscreen</a></li>
                            </ul>
                        </div>
                    </li>
                    <li><a href="tables.html" class=""><i class="lnr lnr-dice"></i> <span>Tables</span></a></li>
                    <li><a href="typography.html" class=""><i class="lnr lnr-text-format"></i> <span>Typography</span></a></li>
                    <li><a href="icons.html" class=""><i class="lnr lnr-linearicons"></i> <span>Icons</span></a></li>
                </ul>
            </nav>
        </div>
        <a class="footer" href="http://twitter.com/share?url=https://goo.gl/1dt1MR&amp;text=So cool! Free Bootstrap dashboard template by @thedevelovers. Download at&amp;hashtags=free,bootstrap,dashboard" title="Twitter share" target="_blank"><i class="fa fa-twitter"></i> <span>SHARE THIS FREEBIE</span></a>
    </div>
    <!-- END SIDEBAR -->
    <!-- MAIN -->
    <div class="main">
        <!-- NAVBAR -->
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-btn">
                    <button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
                </div>
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-menu">
                        <span class="sr-only">Toggle Navigation</span>
                        <i class="fa fa-bars icon-nav"></i>
                    </button>
                </div>
                <div id="navbar-menu" class="navbar-collapse collapse">
                    <form class="navbar-form navbar-left hidden-xs">
                        <div class="input-group">
                            <input type="text" value="" class="form-control" placeholder="Search dashboard...">
                            <span class="input-group-btn"><button type="button" class="btn btn-primary">Go</button></span>
                        </div>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                                <i class="lnr lnr-alarm"></i>
                                <span class="badge bg-danger">5</span>
                            </a>
                            <ul class="dropdown-menu notifications">
                                <li><a href="#" class="notification-item"><span class="dot bg-warning"></span>System space is almost full</a></li>
                                <li><a href="#" class="notification-item"><span class="dot bg-danger"></span>You have 9 unfinished tasks</a></li>
                                <li><a href="#" class="notification-item"><span class="dot bg-success"></span>Monthly report is available</a></li>
                                <li><a href="#" class="notification-item"><span class="dot bg-warning"></span>Weekly meeting in 1 hour</a></li>
                                <li><a href="#" class="notification-item"><span class="dot bg-success"></span>Your request has been approved</a></li>
                                <li><a href="#" class="more">See all notifications</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="lnr lnr-question-circle"></i> <span>Help</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Basic Use</a></li>
                                <li><a href="#">Working With Data</a></li>
                                <li><a href="#">Security</a></li>
                                <li><a href="#">Troubleshooting</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="/resources/AdminPanel/template/assets/img/user.png" class="img-circle" alt="Avatar"> <span>Samuel</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="lnr lnr-user"></i> <span>My Profile</span></a></li>
                                <li><a href="#"><i class="lnr lnr-envelope"></i> <span>Message</span></a></li>
                                <li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li>
                                <li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- END NAVBAR -->
        <!-- MAIN CONTENT -->
        <div class="main-content">
            <div class="container-fluid">
                <h3 class="page-title">Tables</h3>
                <a class="btn" href="AddCustomers.html"><img src="/resources/AdminPanel/template/assets/img/add.png" class="img-circle" alt="Avatar"></a>
                <!-- TABLE HOVER -->
                <div class="panel" id="UpdateModal">
                    <div class="panel-heading">
                        <h3 class="panel-title">Update Customers</h3>
                    </div>
                    <div class="panel-body" >
                        <!--body goes here-->
                        <div class="form">
                            <div class="form-style-5">
                                <form  id ="CustomerForm" method="POST" commandName="update-Customers-entity" action="/update-customers-row.html">

                                    <fieldset>
                                        <input type="hidden" name="Id" id="pid" type="number" placeholder="ID">
                                        <input type="text" name="name" id="pname" placeholder="Your Name *">
                                        <input type="text" name="mobile" id="pmobile" placeholder="Your Mobile *">
                                        <input type="email" name="email" id="pemail" placeholder="Your Email *">
                                        <textarea name="address" id="paddress" placeholder="Address"></textarea>
                                        <input type="text" name="pinCode" id="ppincode" placeholder="Pin Code">
                                        <label for="pcountry">Country:</label>
                                        <select name="country" id="pcountry">

                                            <option value="Afghanistan">Afghanistan</option>

                                            <option value="Aland Islands">Aland Islands</option>

                                            <option value="Albania">Albania</option>

                                            <option value="Algeria">Algeria</option>

                                            <option value="American Samoa">American Samoa</option>

                                            <option value="Andorra">Andorra</option>

                                            <option value="Angola">Angola</option>

                                            <option value="Anguilla">Anguilla</option>

                                            <option value="Antarctica">Antarctica</option>

                                            <option value="Antigua">Antigua</option>

                                            <option value="Argentina">Argentina</option>

                                            <option value="Armenia">Armenia</option>

                                            <option value="Aruba">Aruba</option>

                                            <option value="Australia">Australia</option>

                                            <option value="Austria">Austria</option>

                                            <option value="Azerbaijan">Azerbaijan</option>

                                            <option value="Bahamas">Bahamas</option>

                                            <option value="Bahrain">Bahrain</option>

                                            <option value="Bangladesh">Bangladesh</option>

                                            <option value="Barbados">Barbados</option>

                                            <option value="Barbuda">Barbuda</option>

                                            <option value="Belarus">Belarus</option>

                                            <option value="Belgium">Belgium</option>

                                            <option value="Belize">Belize</option>

                                            <option value="Benin">Benin</option>

                                            <option value="Bermuda">Bermuda</option>

                                            <option value="Bhutan">Bhutan</option>

                                            <option value="Bolivia">Bolivia</option>

                                            <option value="Bosnia">Bosnia</option>

                                            <option value="Botswana">Botswana</option>

                                            <option value="Bouvet Island">Bouvet Island</option>

                                            <option value="Brazil">Brazil</option>

                                            <option value="British Indian Ocean Trty.">British Indian Ocean Trty.</option>

                                            <option value="Brunei Darussalam">Brunei Darussalam</option>

                                            <option value="Bulgaria">Bulgaria</option>

                                            <option value="Burkina Faso">Burkina Faso</option>

                                            <option value="Burundi">Burundi</option>

                                            <option value="Caicos Islands">Caicos Islands</option>

                                            <option value="Cambodia">Cambodia</option>

                                            <option value="Cameroon">Cameroon</option>

                                            <option value="Canada">Canada</option>

                                            <option value="Cape Verde">Cape Verde</option>

                                            <option value="Cayman Islands">Cayman Islands</option>

                                            <option value="Central African Republic">Central African Republic</option>

                                            <option value="Chad">Chad</option>

                                            <option value="Chile">Chile</option>

                                            <option value="China">China</option>

                                            <option value="Christmas Island">Christmas Island</option>

                                            <option value="Cocos (Keeling) Islands">Cocos (Keeling) Islands</option>

                                            <option value="Colombia">Colombia</option>

                                            <option value="Comoros">Comoros</option>

                                            <option value="Congo">Congo</option>

                                            <option value="Congo, Democratic Republic of the">Congo, Democratic Republic of the</option>

                                            <option value="Cook Islands">Cook Islands</option>

                                            <option value="Costa Rica">Costa Rica</option>

                                            <option value="Cote d'Ivoire">Cote d'Ivoire</option>

                                            <option value="Croatia">Croatia</option>

                                            <option value="Cuba">Cuba</option>

                                            <option value="Cyprus">Cyprus</option>

                                            <option value="Czech Republic">Czech Republic</option>

                                            <option value="Denmark">Denmark</option>

                                            <option value="Djibouti">Djibouti</option>

                                            <option value="Dominica">Dominica</option>

                                            <option value="Dominican Republic">Dominican Republic</option>

                                            <option value="Ecuador">Ecuador</option>

                                            <option value="Egypt">Egypt</option>

                                            <option value="El Salvador">El Salvador</option>

                                            <option value="Equatorial Guinea">Equatorial Guinea</option>

                                            <option value="Eritrea">Eritrea</option>

                                            <option value="Estonia">Estonia</option>

                                            <option value="Ethiopia">Ethiopia</option>

                                            <option value="Falkland Islands (Malvinas)">Falkland Islands (Malvinas)</option>

                                            <option value="Faroe Islands">Faroe Islands</option>

                                            <option value="Fiji">Fiji</option>

                                            <option value="Finland">Finland</option>

                                            <option value="France">France</option>

                                            <option value="French Guiana">French Guiana</option>

                                            <option value="French Polynesia">French Polynesia</option>

                                            <option value="French Southern Territories">French Southern Territories</option>

                                            <option value="Futuna Islands">Futuna Islands</option>

                                            <option value="Gabon">Gabon</option>

                                            <option value="Gambia">Gambia</option>

                                            <option value="Georgia">Georgia</option>

                                            <option value="Germany">Germany</option>

                                            <option value="Ghana">Ghana</option>

                                            <option value="Gibraltar">Gibraltar</option>

                                            <option value="Greece">Greece</option>

                                            <option value="Greenland">Greenland</option>

                                            <option value="Grenada">Grenada</option>

                                            <option value="Guadeloupe">Guadeloupe</option>

                                            <option value="Guam">Guam</option>

                                            <option value="Guatemala">Guatemala</option>

                                            <option value="Guernsey">Guernsey</option>

                                            <option value="Guinea">Guinea</option>

                                            <option value="Guinea-Bissau">Guinea-Bissau</option>

                                            <option value="Guyana">Guyana</option>

                                            <option value="Haiti">Haiti</option>

                                            <option value="Heard">Heard</option>

                                            <option value="Herzegovina">Herzegovina</option>

                                            <option value="Holy See">Holy See</option>

                                            <option value="Honduras">Honduras</option>

                                            <option value="Hong Kong">Hong Kong</option>

                                            <option value="Hungary">Hungary</option>

                                            <option value="Iceland">Iceland</option>

                                            <option value="India">India</option>

                                            <option value="Indonesia">Indonesia</option>

                                            <option value="Iran (Islamic Republic of)">Iran (Islamic Republic of)</option>

                                            <option value="Iraq">Iraq</option>

                                            <option value="Ireland">Ireland</option>

                                            <option value="Isle of Man">Isle of Man</option>

                                            <option value="Israel">Israel</option>

                                            <option value="Italy">Italy</option>

                                            <option value="Jamaica">Jamaica</option>

                                            <option value="Jan Mayen Islands">Jan Mayen Islands</option>

                                            <option value="Japan">Japan</option>

                                            <option value="Jersey">Jersey</option>

                                            <option value="Jordan">Jordan</option>

                                            <option value="Kazakhstan">Kazakhstan</option>

                                            <option value="Kenya">Kenya</option>

                                            <option value="Kiribati">Kiribati</option>

                                            <option value="Korea">Korea</option>

                                            <option value="Korea (Democratic)">Korea (Democratic)</option>

                                            <option value="Kuwait">Kuwait</option>

                                            <option value="Kyrgyzstan">Kyrgyzstan</option>

                                            <option value="Lao">Lao</option>

                                            <option value="Latvia">Latvia</option>

                                            <option value="Lebanon">Lebanon</option>

                                            <option value="Lesotho">Lesotho</option>

                                            <option value="Liberia">Liberia</option>

                                            <option value="Libyan Arab Jamahiriya">Libyan Arab Jamahiriya</option>

                                            <option value="Liechtenstein">Liechtenstein</option>

                                            <option value="Lithuania">Lithuania</option>

                                            <option value="Luxembourg">Luxembourg</option>

                                            <option value="Macao">Macao</option>

                                            <option value="Macedonia">Macedonia</option>

                                            <option value="Madagascar">Madagascar</option>

                                            <option value="Malawi">Malawi</option>

                                            <option value="Malaysia">Malaysia</option>

                                            <option value="Maldives">Maldives</option>

                                            <option value="Mali">Mali</option>

                                            <option value="Malta">Malta</option>

                                            <option value="Marshall Islands">Marshall Islands</option>

                                            <option value="Martinique">Martinique</option>

                                            <option value="Mauritania">Mauritania</option>

                                            <option value="Mauritius">Mauritius</option>

                                            <option value="Mayotte">Mayotte</option>

                                            <option value="McDonald Islands">McDonald Islands</option>

                                            <option value="Mexico">Mexico</option>

                                            <option value="Micronesia">Micronesia</option>

                                            <option value="Miquelon">Miquelon</option>

                                            <option value="Moldova">Moldova</option>

                                            <option value="Monaco">Monaco</option>

                                            <option value="Mongolia">Mongolia</option>

                                            <option value="Montenegro">Montenegro</option>

                                            <option value="Montserrat">Montserrat</option>

                                            <option value="Morocco">Morocco</option>

                                            <option value="Mozambique">Mozambique</option>

                                            <option value="Myanmar">Myanmar</option>

                                            <option value="Namibia">Namibia</option>

                                            <option value="Nauru">Nauru</option>

                                            <option value="Nepal">Nepal</option>

                                            <option value="Netherlands">Netherlands</option>

                                            <option value="Netherlands Antilles">Netherlands Antilles</option>

                                            <option value="Nevis">Nevis</option>

                                            <option value="New Caledonia">New Caledonia</option>

                                            <option value="New Zealand">New Zealand</option>

                                            <option value="Nicaragua">Nicaragua</option>

                                            <option value="Niger">Niger</option>

                                            <option value="Nigeria">Nigeria</option>

                                            <option value="Niue">Niue</option>

                                            <option value="Norfolk Island">Norfolk Island</option>

                                            <option value="Northern Mariana Islands">Northern Mariana Islands</option>

                                            <option value="Norway">Norway</option>

                                            <option value="Oman">Oman</option>

                                            <option value="Pakistan">Pakistan</option>

                                            <option value="Palau">Palau</option>

                                            <option value="Palestinian Territory, Occupied">Palestinian Territory, Occupied</option>

                                            <option value="Panama">Panama</option>

                                            <option value="Papua New Guinea">Papua New Guinea</option>

                                            <option value="Paraguay">Paraguay</option>

                                            <option value="Peru">Peru</option>

                                            <option value="Philippines">Philippines</option>

                                            <option value="Pitcairn">Pitcairn</option>

                                            <option value="Poland">Poland</option>

                                            <option value="Portugal">Portugal</option>

                                            <option value="Principe">Principe</option>

                                            <option value="Puerto Rico">Puerto Rico</option>

                                            <option value="Qatar">Qatar</option>

                                            <option value="Reunion">Reunion</option>

                                            <option value="Romania">Romania</option>

                                            <option value="Russian Federation">Russian Federation</option>

                                            <option value="Rwanda">Rwanda</option>

                                            <option value="Saint Barthelemy">Saint Barthelemy</option>

                                            <option value="Saint Helena">Saint Helena</option>

                                            <option value="Saint Kitts">Saint Kitts</option>

                                            <option value="Saint Lucia">Saint Lucia</option>

                                            <option value="Saint Martin (French part)">Saint Martin (French part)</option>

                                            <option value="Saint Pierre">Saint Pierre</option>

                                            <option value="Saint Vincent">Saint Vincent</option>

                                            <option value="Samoa">Samoa</option>

                                            <option value="San Marino">San Marino</option>

                                            <option value="Sao Tome">Sao Tome</option>

                                            <option value="Saudi Arabia">Saudi Arabia</option>

                                            <option value="Senegal">Senegal</option>

                                            <option value="Serbia">Serbia</option>

                                            <option value="Seychelles">Seychelles</option>

                                            <option value="Sierra Leone">Sierra Leone</option>

                                            <option value="Singapore">Singapore</option>

                                            <option value="Slovakia">Slovakia</option>

                                            <option value="Slovenia">Slovenia</option>

                                            <option value="Solomon Islands">Solomon Islands</option>

                                            <option value="Somalia">Somalia</option>

                                            <option value="South Africa">South Africa</option>

                                            <option value="South Georgia">South Georgia</option>

                                            <option value="South Sandwich Islands">South Sandwich Islands</option>

                                            <option value="Spain">Spain</option>

                                            <option value="Sri Lanka">Sri Lanka</option>

                                            <option value="Sudan">Sudan</option>

                                            <option value="Suriname">Suriname</option>

                                            <option value="Svalbard">Svalbard</option>

                                            <option value="Swaziland">Swaziland</option>

                                            <option value="Sweden">Sweden</option>

                                            <option value="Switzerland">Switzerland</option>

                                            <option value="Syrian Arab Republic">Syrian Arab Republic</option>

                                            <option value="Taiwan">Taiwan</option>

                                            <option value="Tajikistan">Tajikistan</option>

                                            <option value="Tanzania">Tanzania</option>

                                            <option value="Thailand">Thailand</option>

                                            <option value="The Grenadines">The Grenadines</option>

                                            <option value="Timor-Leste">Timor-Leste</option>

                                            <option value="Tobago">Tobago</option>

                                            <option value="Togo">Togo</option>

                                            <option value="Tokelau">Tokelau</option>

                                            <option value="Tonga">Tonga</option>

                                            <option value="Trinidad">Trinidad</option>

                                            <option value="Tunisia">Tunisia</option>

                                            <option value="Turkey">Turkey</option>

                                            <option value="Turkmenistan">Turkmenistan</option>

                                            <option value="Turks Islands">Turks Islands</option>

                                            <option value="Tuvalu">Tuvalu</option>

                                            <option value="Uganda">Uganda</option>

                                            <option value="Ukraine">Ukraine</option>

                                            <option value="United Arab Emirates">United Arab Emirates</option>

                                            <option value="United Kingdom">United Kingdom</option>

                                            <option value="United States">United States</option>

                                            <option value="Uruguay">Uruguay</option>

                                            <option value="US Minor Outlying Islands">US Minor Outlying Islands</option>

                                            <option value="Uzbekistan">Uzbekistan</option>

                                            <option value="Vanuatu">Vanuatu</option>

                                            <option value="Vatican City State">Vatican City State</option>

                                            <option value="Venezuela">Venezuela</option>

                                            <option value="Vietnam">Vietnam</option>

                                            <option value="Virgin Islands (British)">Virgin Islands (British)</option>

                                            <option value="Virgin Islands (US)">Virgin Islands (US)</option>

                                            <option value="Wallis">Wallis</option>

                                            <option value="Western Sahara">Western Sahara</option>

                                            <option value="Yemen">Yemen</option>

                                            <option value="Zambia">Zambia</option>

                                            <option value="Zimbabwe">Zimbabwe</option>

                                        </select>
                                        <input type="text" name="city" id="pcity" placeholder="City">
                                        <textarea name="bankDetails" id="pbankdetails" placeholder="Bank Details"></textarea>
                                    </fieldset>

                                    <input type="submit" value="Apply" />

                                </form>
                            </div>

                        </div>


                        <!--Body Ends Here-->
                        <c:forEach  items="${customerlist}" var="listValue">
                            <script>
                               //alert("mara khai");
                                document.getElementById("pid").value=parseInt('${listValue.getId()}');
                                document.getElementById("pname").value='${listValue.getName()}';
                                document.getElementById("pmobile").value='${listValue.getMobile()}';
                                document.getElementById("pemail").value='${listValue.getEmail()}';
                                document.getElementById("paddress").value='${listValue.getAddress()}';
                                document.getElementById("ppincode").value='${listValue.getPinCode()}';
                                document.getElementById("pcountry").value='${listValue.getCountry()}';
                                document.getElementById("pcity").value='${listValue.getCity()}';
                                document.getElementById("pbankdetails").value='${listValue.getBankDetails()}';
                            </script>
                        </c:forEach>

                    </div>
                </div>
                <!-- END TABLE HOVER -->



            </div>
        </div>
        <!-- END MAIN CONTENT -->
        <footer>
            <div class="container-fluid">
                <p class="copyright">&copy; 2017. Developed by <a href="https://theicthub.com/">The ICT Hub Inc.</a></p>
            </div>
        </footer>
    </div>
    <!-- END MAIN -->
</div>
<!-- END WRAPPER -->
<!-- Javascript -->
<script src="/resources/AdminPanel/template/assets/js/jquery/jquery-2.1.0.min.js"></script>
<script src="/resources/AdminPanel/template/assets/js/bootstrap/bootstrap.min.js"></script>
<script src="/resources/AdminPanel/template/assets/js/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="/resources/AdminPanel/template/assets/js/klorofil.min.js"></script>

</body>

</html>

