Feature: PostAnAdd

Scenario Outline: Valid data only
Given user enter <src> as source and <dest> as destination 
When click search 
Then should get <msg> as message

Examples:
|src|dest|msg|
|"gachiawli"|"hitevh"|"successful"|
|""|"hitevh"|"invalid"|
|""|""|"invalid"|

