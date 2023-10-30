# Facade-Pattern For A Simplified Hotel Management System (HMS)

Facade Pattern enables simplicity within a complex interface, and it conceals the messy details to showcase how easy the interface interacts with users within the system.


## Simplified Hotel Management System

The HotelApp needs to manage various hotel services for guest check-in and check-out. These services include valet parking for vehicles, room cleaning, and handling luggage carts. However, the HotelApp aims to interact with these services through a simplified, single interface provided by the FrontDesk. The FrontDesk class should delegate the client's requests to the appropriate service classes (Valet, HouseKeeping, Cart) while abstracting the service details from the client.

## Class Definitions:

HotelService (Interface): Defines the common interface for all hotel services.

Valet: A service class implementing the HotelService interface, responsible for vehicle valet parking and pick-up. It includes the pickUpVehicle(plateNumber) method.

HouseKeeping: A service class implementing the HotelService interface, responsible for room cleaning. It includes the cleanRoom(roomNumber) method.

Cart: A service class implementing the HotelService interface, responsible for handling luggage cart requests. It includes the requestCart(numberOfCarts) method.

FrontDesk: The facade class that coordinates interactions between the client (HotelApp) and the individual hotel services.

HotelApp: The client class that uses the FrontDesk facade to access and utilize hotel services seamlessly.

## UML IMPLEMENTATION DIAGRAM
<img width="1761" alt="CSL311-18_WK10-11_UML_CHUA_SE" src="https://github.com/VinceTedChua/facade-Pattern/assets/142372312/a7e6cf4f-0f4a-4989-98a0-384184a0804a">

## Why Use Facade Design Pattern?
1. Reduced Complexity: The Facade Design Pattern hides the complexities of the subsystem from the client, making it easier for the client to use.
2. Improved Maintainability: The Facade Design Pattern makes it easier to maintain the subsystem by encapsulating its complexity.
3. Increased Reusability: The Facade Design Pattern makes the subsystem more reusable by providing a unified interface.
4. Potentially Improved Performance: The Facade Design Pattern can potentially improve performance by caching results or optimizing the order in which operations are performed.


## Sample Execution of The Hotel Management System

In this project, we've utilized the Face Pattern to create a simplified Hotel Management System. Allowing you to interact with services of the hotel via front Desk.

<img width="1792" alt="Facade_Output" src="https://github.com/VinceTedChua/facade-Pattern/assets/142372312/35182b3d-e124-42b9-977d-da54550eb52a">
