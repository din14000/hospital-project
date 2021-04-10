# hospital-project @ Done By Din Abarbanel for JohnBryce academy, finished at 10/04/2021 , using Eclipse and JavaSE-13
 __   __  _______  _______  _______  ___   _______  _______  ___        _______  __   __  _______  _______  __   __  _______ 
|  | |  ||       ||       ||       ||   | |       ||   _   ||   |      |       ||  | |  ||       ||       ||  | |  ||       |
|  |_|  ||   _   ||  _____||    _  ||   | |_     _||  |_|  ||   |      |   _   ||  | |  ||_     _||    _  ||  | |  ||_     _|
|       ||  | |  || |_____ |   |_| ||   |   |   |  |       ||   |      |  | |  ||  |_|  |  |   |  |   |_| ||  |_|  |  |   |  
|       ||  |_|  ||_____  ||    ___||   |   |   |  |       ||   |___   |  |_|  ||       |  |   |  |    ___||       |  |   |  
|   _   ||       | _____| ||   |    |   |   |   |  |   _   ||       |  |       ||       |  |   |  |   |    |       |  |   |  
|__| |__||_______||_______||___|    |___|   |___|  |__| |__||_______|  |_______||_______|  |___|  |___|    |_______|  |___|  

########################################  Hospital-1  	########################################
Room 1:
Doctor = Doctor name: Doctor1, ID: 1, Age: 88 specializes at curing TUBERCULOSIS and belongs to room 1, 
Nurse = Nurse name: Nurse1, ID: 2, Age: 107 rooms: [1, 0], 
Patients =
 Patient name: Patient1, ID: 3, Age: 52 has TUBERCULOSIS and will be cured in approximately 8 days
 Patient name: Patient2, ID: 4, Age: 105 has PNEUMONIA and will be cured in approximately 8 days
 Patient name: Patient3, ID: 5, Age: 45 has CARDIO and will be cured in approximately 11 days
 Patient name: Patient4, ID: 6, Age: 70 has FRACTURE and will be cured in approximately 18 days
 Patient name: Patient5, ID: 7, Age: 74 has PNEUMONIA and will be cured in approximately 7 days
---------------------------------------------------------------------------------------------------------
Room 2:
Doctor = Doctor name: Doctor2, ID: 8, Age: 41 specializes at curing TUBERCULOSIS and belongs to room 2, 
Nurse = Nurse name: Nurse2, ID: 9, Age: 64 rooms: [2, 0], 
Patients =
 Patient name: Patient6, ID: 10, Age: 100 has FRACTURE and will be cured in approximately 5 days
 Patient name: Patient7, ID: 11, Age: 51 has PNEUMONIA and will be cured in approximately 7 days
 Patient name: Patient8, ID: 12, Age: 73 has PNEUMONIA and will be cured in approximately 12 days
 Patient name: Patient9, ID: 13, Age: 84 has COVID19 and will be cured in approximately 10 days
 Patient name: Patient10, ID: 14, Age: 47 has TUBERCULOSIS and will be cured in approximately 3 days
---------------------------------------------------------------------------------------------------------
Room 3:
Doctor = Doctor name: Doctor3, ID: 15, Age: 64 specializes at curing CARDIO and belongs to room 3, 
Nurse = Nurse name: Nurse3, ID: 16, Age: 25 rooms: [3, 0], 
Patients =
 Patient name: Patient11, ID: 17, Age: 89 has FRACTURE and will be cured in approximately 9 days
 Patient name: Patient12, ID: 18, Age: 25 has CARDIO and will be cured in approximately 8 days
 Patient name: Patient13, ID: 19, Age: 48 has TUBERCULOSIS and will be cured in approximately 13 days
 Patient name: Patient14, ID: 20, Age: 110 has TUBERCULOSIS and will be cured in approximately 17 days
 Patient name: Patient15, ID: 21, Age: 68 has TUBERCULOSIS and will be cured in approximately 11 days
---------------------------------------------------------------------------------------------------------
Room 4:
Doctor = Doctor name: Doctor4, ID: 22, Age: 80 specializes at curing COVID19 and belongs to room 4, 
Nurse = Nurse name: Nurse4, ID: 23, Age: 26 rooms: [4, 0], 
Patients =
 Patient name: Patient16, ID: 24, Age: 95 has FRACTURE and will be cured in approximately 10 days
 Patient name: Patient17, ID: 25, Age: 115 has PNEUMONIA and will be cured in approximately 14 days
 Patient name: Patient18, ID: 26, Age: 105 has TUBERCULOSIS and will be cured in approximately 14 days
 Patient name: Patient19, ID: 27, Age: 64 has PNEUMONIA and will be cured in approximately 16 days
 Patient name: Patient20, ID: 28, Age: 60 has FRACTURE and will be cured in approximately 7 days
---------------------------------------------------------------------------------------------------------
Room 5:
Doctor = Doctor name: Doctor5, ID: 29, Age: 76 specializes at curing CARDIO and belongs to room 5, 
Nurse = Nurse name: Nurse5, ID: 30, Age: 116 rooms: [5, 0], 
Patients =
 Patient name: Patient21, ID: 31, Age: 100 has TUBERCULOSIS and will be cured in approximately 8 days
 Patient name: Patient22, ID: 32, Age: 114 has PNEUMONIA and will be cured in approximately 13 days
 Patient name: Patient23, ID: 33, Age: 73 has CARDIO and will be cured in approximately 8 days
 Patient name: Patient24, ID: 34, Age: 70 has TUBERCULOSIS and will be cured in approximately 19 days
 Patient name: Patient25, ID: 35, Age: 71 has PNEUMONIA and will be cured in approximately 15 days
---------------------------------------------------------------------------------------------------------

######################### Testing Nurse - adding another room for nurse 2 and room 3 #########################
Nurse name: Nurse2, ID: 9, Age: 64 rooms: [2, 3]
######################### Testing Nurse - adding 3rd room for nurse 2 and room 4 #########################
Error - All rooms assigned for this nurse
Nurse name: Nurse2, ID: 9, Age: 64 rooms: [2, 3]
 __   __  _______  _______  _______  ___   _______  _______  ___        _______  _______  _______  _______  ___   _______  _______  ___   _______  _______ 
|  | |  ||       ||       ||       ||   | |       ||   _   ||   |      |       ||       ||   _   ||       ||   | |       ||       ||   | |       ||       |
|  |_|  ||   _   ||  _____||    _  ||   | |_     _||  |_|  ||   |      |  _____||_     _||  |_|  ||_     _||   | |  _____||_     _||   | |       ||  _____|
|       ||  | |  || |_____ |   |_| ||   |   |   |  |       ||   |      | |_____   |   |  |       |  |   |  |   | | |_____   |   |  |   | |       || |_____ 
|       ||  |_|  ||_____  ||    ___||   |   |   |  |       ||   |___   |_____  |  |   |  |       |  |   |  |   | |_____  |  |   |  |   | |      _||_____  |
|   _   ||       | _____| ||   |    |   |   |   |  |   _   ||       |   _____| |  |   |  |   _   |  |   |  |   |  _____| |  |   |  |   | |     |_  _____| |
|__| |__||_______||_______||___|    |___|   |___|  |__| |__||_______|  |_______|  |___|  |__| |__|  |___|  |___| |_______|  |___|  |___| |_______||_______|

######################### Testing Statistics - Amount of patients, nurses and doctors in the hospital #########################
Amount of Patients: 25
Amount of Nurses: 5
Amount of Doctors: 5

######################### Testing Statistics - Average time to cure of all the patients in the hospital #########################
The average time to cure of all the patients is 10.84 days

######################### Testing Statistics - Average time to cure of per disease of all the patients in the hospital #########################
The average time to cure for each disease is: 
TUBERCULOSIS: 11.62 days
PNEUMONIA: 11.5 days
COVID19: 10.0 days
FRACTURE: 9.8 days
CARDIO: 9.0 days

######################### Testing Statistics - Average age of patients per room  #########################
The average age of patients per room is: 
Room number: 1 Average patient age:  69.2 years
Room number: 2 Average patient age:  71.0 years
Room number: 3 Average patient age:  68.0 years
Room number: 4 Average patient age:  87.8 years
Room number: 5 Average patient age:  85.6 years

######################### Testing Statistics - Most common disease in the hospital  #########################
The most common disease among all patients is TUBERCULOSIS with 8 patients having this disease;	 PNEUMONIA with 8 patients having this disease;	 

######################### Testing Statistics - Most uncommon (rare) disease in the hospital  #########################
The most uncommon (rare) disease among all patients is COVID19 with 1 patients having this disease; 

######################### Testing Statistics -Avarage staff (doctors and nurses) age in the hospital  #########################
The average age of all the staff (doctors and nurses) is 68.7 years

