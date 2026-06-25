package org.java.java17NewFeatures;

public sealed class SealedPayment permits CreditCardPayment, UpiPayment, NetBankingPayment { }
/*
* Note - permits class can have only these 3 option
* 1 - final
* 2 - sealed
* 3 - non-sealed
* ==============================================================
* */
/*
* SCENARIO ONE
*/
final class CreditCardPayment extends SealedPayment { }
final class UpiPayment extends SealedPayment{ }

final class NetBankingPayment extends SealedPayment{ }
/*
* SCENARIO TWO
*/
sealed class Animal permits Dog {}

sealed  class Dog extends Animal permits GullyDog  {}

final class GullyDog extends Dog {}

/*
 * SCENARIO THREE
*/
sealed class Vehical permits  Car{}

non-sealed class Car extends  Vehical{}

class Sports extends Car {}
class Sedan extends Car {}
class Suv  extends Car {}
class Hatchback extends Car {}

