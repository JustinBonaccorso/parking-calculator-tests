# parking-calculator-tests
Selenium Tests written in JAVA to test the parking calculator

Test Cases are written in Java and uploaded independently. 
A testing suite was also in the works, but I resisted due to the nature of Test Case #2 and the 'excitement' that it provided.
As these tests are relatively straight forward I attempted to make the testing reflect the basic nature of the requirements.
While writing my test cases I attempted to account for each different Parking option, as well as an unusual duration. 
In creating these I mainly utilized: Selenium IDE/WebDriver, XCode, Firefox, FireBug, GitHub, Eclipse



<b>Test Case 1 // Provided Test Case.</b>
- Navigate to http://adam.goucher.ca/parkcalc/index.php
- Select the Short-Term Parking option from the Choose a Lot dropdown.
- Enter 10:00 and 01/01/2014 in the Choose Entry Date and Time section
- Select PM option in the Choose Entry Date and Time section
- Enter 11:00 and 01/01/2014 in the Choose Leaving Date and Time section
- Select PM option in the Choose Leaving Date and Time section
- Click Calculate
- Check that the COST is equal to $ 2.00
- Check that the duration of stay is equal to (0 Days, 1 Hours, 0 Minutes)	


<b>Test Case 2 // Provided Test Case.</b> (This case has been adjusted, see ‘issues’ for more information)
- Navigate to http://adam.goucher.ca/parkcalc/index.php
- Select the Long-Term Parking option from the Choose a Lot dropdown
- Enter 01/01/2014 in the Choose Entry Date and Time section
- Enter 02/01/2014 in the Choose Leaving Date and Time section
- Click Calculate
- Check that the COST is equal to $ 270.00
- Check that the duration of stay is equal to (31 Days, 0 Hours, 0 Minutes)


<b>Test Case 3 // Provided Test Case.</b>
- Navigate to http://adam.goucher.ca/parkcalc/index.php
- Select the Short-Term Parking option from the Choose a Lot dropdown
- Leave Entry Time unchanged
- Enter 01/02/2014 in the Choose Entry Date and Time section
- Leave Leaving Time unchanged
- Enter 01/01/2014 in the Choose Leaving Date and Time section
- Click Calculate
- Check that the error message: ERROR! Your Exit Date And Time Is Before Your Entry Date or Time


<b>Test Case 4 // </b> This case is testing for Valet Parking, as well as an irregular duration. 
- Navigate to http://adam.goucher.ca/parkcalc/index.php
- Select the Valet Parking option from the Choose a Lot dropdown
- Enter 08:15 and 05/05/2015 in the Choose Entry Date and Time section
- Select AM option in the Choose Entry Date and Time section
- Enter 11:00 and 05/09/2015 in the Choose Leaving Date and Time section
- Select PM option in the Choose Leaving Date and Time section
- Click Calculate
- Check that the COST is equal to $ 150.00
- Check that the duration of stay is equal to (4 Days, 14 Hours, 45 Minutes)
	
	
<b>Test Case 5 // </b> A Longer stay and Long-Term Garage Parking are being tested with this case.
- Navigate to http://adam.goucher.ca/parkcalc/index.php
- Select the Long-Term Garage Parking option from the Choose a Lot dropdown
- Enter 05:00 and 01/05/2015 in the Choose Entry Date and Time section
- Select PM option in the Choose Entry Date and Time section
- Enter 03:00 and 02/07/2015 in the Choose Leaving Date and Time section
- Select PM option in the Choose Leaving Date and Time section
- Click Calculate
- Check that the COST is equal to $ 348.00
- Check that the duration of stay is equal to (32 Days, 22 Hours, 0 Minutes)		


<b>Test Case 6 // </b> Economy Parking and the half hour interval are being tested with this case.
- Navigate to http://adam.goucher.ca/parkcalc/index.php
- Select the Economy Parking option from the Choose a Lot dropdown
- Enter 01:00 and 07/10/2015 in the Choose Entry Date and Time section
- Select AM option in the Choose Entry Date and Time section
- Enter 11:30 and 07/10/2015 in the Choose Leaving Date and Time section
- Select PM option in the Choose Leaving Date and Time section
- Click Calculate
- Check that the COST is equal to $ 9.00
- Check that the duration of stay is equal to (0 Days, 22 Hours, 30 Minutes)		


<b>Test Case 7 // </b> Valet Parking with a shorter duration are being tested with this case.
- Navigate to http://adam.goucher.ca/parkcalc/index.php
- Select the Valet Parking option from the Choose a Lot dropdown
- Enter 08:00 and 09/10/2015 in the Choose Entry Date and Time section
- Select AM option in the Choose Entry Date and Time section
- Enter 09:30 and 09/10/2015 in the Choose Leaving Date and Time section
- Select AM option in the Choose Leaving Date and Time section
- Click Calculate
- Check that the COST is equal to $ 12.00
- Check that the duration of stay is equal to (0 Days, 1 Hours, 30 Minutes)


<b>Test Case 8 // </b> This case tests a Leaving time which is before the entry time. 
- Navigate to http://adam.goucher.ca/parkcalc/index.php
- Select the Long-Term Surface Parking option from the Choose a Lot dropdown
- Enter 01:00 and 01/20/2015 in the Choose Entry Date and Time section
- Select PM option in the Choose Entry Date and Time section
- Enter 08:00 and 01/20/2015 in the Choose Leaving Date and Time section
- Select AM option in the Choose Leaving Date and Time section
- Click Calculate
- Check that the COST is equal to $ 0.00
- Check that the duration of stay is equal to (-1 Days, 19 Hours, 0 Minutes)	
