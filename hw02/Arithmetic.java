//Yuecheng Shi
//lab2
//Arithmetric Program

public class Arithmetic{
 public static void main(String [] args){
int numPants = 3;//Number of pairs of pants
double pantsPrice = 34.98;//Cost per pair of pants
int numShirts = 2;//Number of sweatshirts
double shirtPrice = 24.99;//Cost per shirt
int numBelts = 1;//Number of belts
double beltCost = 33.99;//cost per box of envelopes
double paSalesTax = 0.06;//the tax rate

double totalCostOfPants=(numPants)*(pantsPrice);//total cost of pants
double totalCostOfShirts=(numShirts)*(shirtPrice);//total cost of shirts
double totalCostOfBelts=(numBelts)*(beltCost);//total cost of belts
System.out.println(" The total cost of pants is "+totalCostOfPants+" dollars");
System.out.println(" The total cost of shirts is "+totalCostOfShirts+" dollars");
System.out.println(" The total cost of belts is "+totalCostOfBelts+" dollars");

double salesTaxOnPants=(pantsPrice)*(paSalesTax);
double salesTaxOnShirts=(shirtPrice)*(paSalesTax);
double salesTaxOnBelts=(beltCost)*(paSalesTax);
int salestaxonpants= (int) salesTaxOnPants;
int salestaxonshirts= (int) salesTaxOnShirts;
int salestaxonbelts= (int) salesTaxOnBelts;
double Salestaxonpants=(salestaxonpants)/1.00;
double Salestaxonshirts=(salestaxonshirts)/1.00;
double Salestaxonbelts=(salestaxonbelts)/1.00;

System.out.println(" The sales tax charged on pants is "+Salestaxonpants+" dollars");
System.out.println(" The sales tax charged on shirts is "+Salestaxonshirts+" dollars");
System.out.println(" The sales tax charged on pants is "+Salestaxonbelts+" dollars");

double totalCostOfPurchases=(totalCostOfPants)+(totalCostOfShirts)+(totalCostOfBelts);
double totalSalestax=(totalCostOfPurchases)*(paSalesTax);
double totalPaid=(totalCostOfPurchases)+(totalSalestax);
int totalsalestax= (int) totalSalestax;
int totalpaid= (int) totalPaid;
double Totalsalestax= totalsalestax/1.00;
double Totalpaid=totalpaid/1.00;

System.out.println(" The total cost of purchases is "+totalCostOfPurchases+" dollars");
System.out.println(" The total sales tax is "+Totalsalestax+" dollars");
System.out.println(" The total paid for this transaction is "+Totalpaid+" dollars");
}
    }