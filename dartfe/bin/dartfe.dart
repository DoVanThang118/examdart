// import 'package:dartfe/dartfe.dart' as dartfe;

import 'package:dartfe/model/customer.dart';
import 'package:dartfe/service/customer_service.dart';
import 'package:dartfe/service/impl/customer_service_impl.dart';

void main(List<String> arguments) async {

  CustomerService customerService = CustomerServiceImpl();
  List<Customer> customers = await customerService.getAll();
  print("customer $customers");

  // Create
  Customer newCustomer = Customer(fullName: "asd", address: "123 sdsa dfee");
  Customer createdCustomer = await customerService.addCustomer(newCustomer);
  print("Created Customer: $createdCustomer");

}
