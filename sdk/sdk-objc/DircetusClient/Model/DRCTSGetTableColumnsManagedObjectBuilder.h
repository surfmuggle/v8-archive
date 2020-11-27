#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

#import "DRCTSGetTableColumnsDataManagedObjectBuilder.h"
#import "DRCTSGetTablesMetaManagedObjectBuilder.h"

#import "DRCTSGetTableColumnsManagedObject.h"
#import "DRCTSGetTableColumns.h"

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


@interface DRCTSGetTableColumnsManagedObjectBuilder : NSObject

@property (nonatomic, strong) DRCTSGetTablesMetaManagedObjectBuilder * metaBuilder;
@property (nonatomic, strong) DRCTSGetTableColumnsDataManagedObjectBuilder * dataBuilder;


-(DRCTSGetTableColumnsManagedObject*)createNewDRCTSGetTableColumnsManagedObjectInContext:(NSManagedObjectContext*)context;

-(DRCTSGetTableColumnsManagedObject*)DRCTSGetTableColumnsManagedObjectFromDRCTSGetTableColumns:(DRCTSGetTableColumns*)object context:(NSManagedObjectContext*)context;

-(void)updateDRCTSGetTableColumnsManagedObject:(DRCTSGetTableColumnsManagedObject*)object withDRCTSGetTableColumns:(DRCTSGetTableColumns*)object2;

-(DRCTSGetTableColumns*)DRCTSGetTableColumnsFromDRCTSGetTableColumnsManagedObject:(DRCTSGetTableColumnsManagedObject*)obj;

-(void)updateDRCTSGetTableColumns:(DRCTSGetTableColumns*)object withDRCTSGetTableColumnsManagedObject:(DRCTSGetTableColumnsManagedObject*)object2;

@end