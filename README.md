# Inventory Management Webapp

This is an unfinished work in progress.  
Creating this web-application serves the dual purpose of building my publicly visible portfolio whilst also learning my way around the play framework.  
This project is based on Nicolas Leroux and Sietse de Kapers Play for Java (https://www.manning.com/books/play-for-java).
 
As I am using Play 2.7.0 and many things changed over the years, the book was a good starting point and still delivers good explanations for concepts,
yet mostly serves as inspiration. Study of Plays documentation and migration guides, combined with experimentation, 
are necessary to build a similiar Application with Play 2.7.0.


Implementations may be suboptimal and are subject to change.

If anyone decides to use this as a reference point for their own projects and is in need of help or clarification I will help as well as I reasonably can.  
Likewise, should anyone come across this and see potential for optimization, I will check and am thankful for every contribution.

## Todo
* Add unnecessary files and folders to .gitignore
* Travis CI integration 
* Input validation / sanitation by either:
    * form presubmit validation
    * validation in controller, between form binding and data processing
* Noscript blocks to handle:
    * Modals
    * Delete calls
* JSON based API
    * Add swagger for the API
* Product stock management
* User authentication
* Add automated tests for Models and Controllers
* Change from h2 database to MySQL or PostgreSQL
* Generate Production version
    * examine possibilities of doing so in a  Docker container
    * Deploy on AWS
* Change hardcoded filepath in products controller to a relative path

## Technologies
| Tech                  | Use                                   |
| --------------------- |:-------------------------------------:|
| Play 2.7.0            | Framework (http://playframework.org)  |
| Java                  | Models and Controllers                |
| Scala                 | View templates                        |
| Bootstrap             | Make it pretty enough                 |
| Javascript / jQuery   | Bootstrap Modals and Delete calls     |
| H2                    | Database                              |
| HTLM / CSS            | Essentials of the Web                 |

