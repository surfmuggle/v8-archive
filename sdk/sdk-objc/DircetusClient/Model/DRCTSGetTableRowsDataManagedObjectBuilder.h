#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>


#import "DRCTSGetTableRowsDataManagedObject.h"
#import "DRCTSGetTableRowsData.h"

/**
* directus.io
* API for directus.io
*
* OpenAPI spec version: 1.1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/


@interface DRCTSGetTableRowsDataManagedObjectBuilder : NSObject



-(DRCTSGetTableRowsDataManagedObject*)createNewDRCTSGetTableRowsDataManagedObjectInContext:(NSManagedObjectContext*)context;

-(DRCTSGetTableRowsDataManagedObject*)DRCTSGetTableRowsDataManagedObjectFromDRCTSGetTableRowsData:(DRCTSGetTableRowsData*)object context:(NSManagedObjectContext*)context;

-(void)updateDRCTSGetTableRowsDataManagedObject:(DRCTSGetTableRowsDataManagedObject*)object withDRCTSGetTableRowsData:(DRCTSGetTableRowsData*)object2;

-(DRCTSGetTableRowsData*)DRCTSGetTableRowsDataFromDRCTSGetTableRowsDataManagedObject:(DRCTSGetTableRowsDataManagedObject*)obj;

-(void)updateDRCTSGetTableRowsData:(DRCTSGetTableRowsData*)object withDRCTSGetTableRowsDataManagedObject:(DRCTSGetTableRowsDataManagedObject*)object2;

@end