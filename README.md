# JAVA Collections and Strings
Repository for demonstrations and challenges related to Strings, Arrays, Sets, Maps in JAVA

Collections inherit from iteratable. All collections can grow and shrink in size

String: Immutable character array
Arrays : Size has to be pre-determined, duplicates allowed
List: Ordered list, duplicates allowed
Sets: Unordered (order of iteration is not guranteed)
Map: Key based access
Stack: Insert and Retrieve in a specific order, usually last inserted is the first to access (LIFO)
Queue: Ordered storing, usually inserted at one end and accessed from another end (FIFO), however order can be altered

There are three generic types of collection: ordered lists, dictionaries/maps, and sets.


### Tricky things

#### Queues
- If trying to access from an empty queue, could wait indefinitely or time out after some time
