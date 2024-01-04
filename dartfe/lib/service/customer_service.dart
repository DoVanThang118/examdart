import 'package:dartfe/model/customer.dart';

abstract class CustomerService{
  Future<List<Customer>> getAll();
  Future<Customer> addCustomer(Customer customer);

}