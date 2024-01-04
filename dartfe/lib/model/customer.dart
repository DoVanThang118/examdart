class Customer{
  int? id;
  String? fullName;
  DateTime? birthday;
  String? address;
  String? phoneNumber;
  Customer({this.id, this.fullName, this.birthday, this.address, this.phoneNumber});
  factory Customer.valueFromJson(Map<String,dynamic> json){
    return Customer(
        id: json["id"] as int,
        fullName: json["fullName"] as String,
        birthday: json["birthday"] as DateTime,
        address: json["address"] as String,
        phoneNumber: json["phoneNumber"] as String
    );
  }
  Map<String, dynamic> toJson() {
    return {
      "id": id,
      "name": fullName,
      "birthday": birthday,
      "address": address,
      "phoneNumber": phoneNumber,
    };
  }
  @override
  String toString(){
    return "id: $id, name:$fullName, birthday:$birthday, address:$address, phoneNumber: $phoneNumber";
  }
}