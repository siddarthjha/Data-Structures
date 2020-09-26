class CallHandler
{
  final int levels = 3;
  final int respondants = 10;
  final int managers = 3;
  final int directors = 2;
  // List of employess level
  List<List<Employee>> employelevels;
  List<List<Call>> callqueue;
  
  public callhandler()
  {
    //...
  }
  
  public Employee getHandler(Call call)
  {
    //...
  }
  
  public void dispatchCall(Call call)
  {
    //...
  }
  
  public boolean assignCall(Employee emp)
  {
    //...
  }
  
}
class Call
{
  private Rank rank;
  public Call(caller c)
  {
    rank = Rank.responder
      caller = c;
  // Call represents a call from user and assigned to first minimum employeer
}

class Employee
{
  // This class is super class for Director Manager Respondent
  public Employee(CallHandler h)
  {
    //...
  }
  public void callEscalteAndAssign()
  {
    //...
  }
}
  
class Director extends Employee
{
  //...
}
class Manager extends Employee
{
  //...
}
class Respondent extends Employee
{
  //...
}

    //

