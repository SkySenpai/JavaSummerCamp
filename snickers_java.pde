// big problem
//     how many snickers can i buy
// problems
//     how much us dollars
double ukMoney = 3500;
double conversionRate = 1.27;

println(ukMoney * conversionRate);
//     we have 4444.999933242798$

//     how much is a snicker

// snickers price and total money in USD

double snickersPrice = 0.97; 
float Total = 4444.999933242798;

//Tax

double salesTaxNj = 1.15;
double salesTaxNyc = 1.12;

//NYC Bars

double totalCostOf2300InNYC = ((snickersPrice * salesTaxNyc) * 2300);
println("Money Left from New York " + totalCostOf2300InNYC);

//remaining money

double remainingMoney = ( Total - totalCostOf2300InNYC);

//Senegal tax rate and base cost
// senegalTax = 1.27
double senegalBarAndTax = (0.85 * 1.27);
println("senegal Bar and Tax " + senegalBarAndTax);
double senegalBarsPerDollar = (583.33215 / senegalBarAndTax );
println("bars per dollar " + senegalBarsPerDollar);

//Senegal bars

double barsTotal = (remainingMoney * senegalBarsPerDollar);
println("bars total " + barsTotal);

// you can buy the 2,300 in new york + 1,051,716 snickers in senegal











 
