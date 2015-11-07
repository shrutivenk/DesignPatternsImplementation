Volatile keyword is used so that no value is saved to local thread cache. All read/writes go directly to the main memory
Double checked locking means we dont have to synchronize the whole method which could be wasteful. We use synchronization only on object creation


