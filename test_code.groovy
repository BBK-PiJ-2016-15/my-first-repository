println "Type a number"

a = System.console()readLine()
int b = Integer.parseInt(a)

println a + " * 1 = "+ b * 1 
println a + " * 2 = "+ b * 2 
println a + " * 3 = "+ b * 3 
println a + " * 4 = "+ b * 4 
println a + " * 5 = "+ b * 5 
println a + " * 6 = "+ b * 6 
println a + " * 7 = "+ b * 7 
println a + " * 8 = "+ b * 8 
println a + " * 9 = "+ b * 9 
println a + " * 10 = "+ b * 10 

tenth = b * 10

if (tenth > 1000) {
	println a +" * 10 is greater than 1000"
}
else{
	println a + " * 10 is smaller than 1000"}