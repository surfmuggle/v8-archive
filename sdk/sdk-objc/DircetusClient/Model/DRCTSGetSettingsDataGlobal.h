#import <Foundation/Foundation.h>
#import "DRCTSObject.h"

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





@protocol DRCTSGetSettingsDataGlobal
@end

@interface DRCTSGetSettingsDataGlobal : DRCTSObject


@property(nonatomic) NSString* cmsUserAutoSignOut;

@property(nonatomic) NSString* projectName;

@property(nonatomic) NSString* projectUrl;

@property(nonatomic) NSString* cmsColor;

@property(nonatomic) NSString* rowsPerPage;

@property(nonatomic) NSString* cmsThumbnailUrl;

@end