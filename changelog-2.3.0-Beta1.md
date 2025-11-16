## 2.3.0-Beta1

### Analysis API
[`KT-80303`](https://youtrack.jetbrains.com/issue/KT-80303) Move `:native:analysis-api-klib-reader` to `:libraries:tools`

### Analysis API. Code Compilation
[`KT-78554`](https://youtrack.jetbrains.com/issue/KT-78554) K2 IDE / Kotlin Debugger: ISE “No override for FUN IR_EXTERNAL_DECLARATION_STUB” on calling toString() for local class instance during evaluation
[`KT-73201`](https://youtrack.jetbrains.com/issue/KT-73201) K2 IDE: Error while evaluating expressions with local classes

### Analysis API. FIR
[`KT-46375`](https://youtrack.jetbrains.com/issue/KT-46375) Analysis API: Support cross-file class redeclaration checks using indices
[`KT-80471`](https://youtrack.jetbrains.com/issue/KT-80471) Analysis API: Deduplicate equivalent call candidates in `resolveToCallCandidates`
[`KT-79653`](https://youtrack.jetbrains.com/issue/KT-79653) [Analysis API] ContextCollector: BODY context of enum classes doesn't contain enum entries
[`KT-75858`](https://youtrack.jetbrains.com/issue/KT-75858) K2 AA: False positive 'property must be initialized' on incremental analysis with 'field' usage and semicolon in setter
[`KT-80231`](https://youtrack.jetbrains.com/issue/KT-80231) AnnotationArgumentsStateKeepers doesn't restore the initial annotation in some cases
[`KT-80233`](https://youtrack.jetbrains.com/issue/KT-80233) Pull mutation out of AnnotationArgumentsStateKeepers
[`KT-71466`](https://youtrack.jetbrains.com/issue/KT-71466) `LLFirBuiltinsSessionFactory` uses `createCompositeSymbolProvider`
[`KT-76432`](https://youtrack.jetbrains.com/issue/KT-76432) JavaClassUseSiteMemberScope: Expected FirResolvedTypeRef with ConeKotlinType but was FirUserTypeRefImpl

### Analysis API. Infrastructure
[`KT-80717`](https://youtrack.jetbrains.com/issue/KT-80717) Support IntelliJ Bazel build in the Kotlin Coop development mode

### Analysis API. Light Classes
[`KT-80656`](https://youtrack.jetbrains.com/issue/KT-80656) Duplicate no-args constructor in PSI
[`KT-60490`](https://youtrack.jetbrains.com/issue/KT-60490) Symbol Light Classes: Property accessors from a delegated interface don't present in the delegating class
[`KT-79689`](https://youtrack.jetbrains.com/issue/KT-79689) SymbolLightClassForClassLike.toString() causes PSI tree loading
[`KT-80690`](https://youtrack.jetbrains.com/issue/KT-80690) Private interface functions are not present in light classes
[`KT-80256`](https://youtrack.jetbrains.com/issue/KT-80256) K2: Certain actions in JPA code causes infinite PIEAE: "Element class CompositeElement of type REFERENCE_EXPRESSION (class KtNameReferenceExpressionElementType)"
[`KT-79012`](https://youtrack.jetbrains.com/issue/KT-79012) Add a high-level overview of light classes

### Analysis API. Providers and Caches
[`KT-78882`](https://youtrack.jetbrains.com/issue/KT-78882) K2 AA: Calling containingSymbol on getProgressionLastElement causes exception
[`KT-58325`](https://youtrack.jetbrains.com/issue/KT-58325) Analysis API: Combine `LLKotlinStubBasedLibrarySymbolProvider`s in session dependencies (optimization)
[`KT-77825`](https://youtrack.jetbrains.com/issue/KT-77825) Analysis API: `CheckersComponent` consumes a lot of memory while being unused in LL FIR sessions
[`KT-76526`](https://youtrack.jetbrains.com/issue/KT-76526) Incorrect built-in module is provided for non-JVM sources in Standalone
[`KT-62549`](https://youtrack.jetbrains.com/issue/KT-62549) Analysis API: Cache callables in combined Kotlin symbol providers
[`KT-70721`](https://youtrack.jetbrains.com/issue/KT-70721) LL FIR: investigate possibility of moving `LLFirFirClassByPsiClassProvider . getClassByPsiClass (PsiClass)`  to symbol providers
[`KT-72998`](https://youtrack.jetbrains.com/issue/KT-72998) Analysis API: Introduce `getClassLikeSymbolByPsi` to LL FIR symbol providers

### Analysis API. Standalone
[`KT-80573`](https://youtrack.jetbrains.com/issue/KT-80573) Potential performance issue on class ID computation
[`KT-80559`](https://youtrack.jetbrains.com/issue/KT-80559) Try to optimize KotlinStandaloneDeclarationProviderFactory startup for tests
[`KT-71706`](https://youtrack.jetbrains.com/issue/KT-71706) Analysis API Standalone: `StandaloneProjectFactory.createSearchScopeByLibraryRoots` creates inefficient file-based search scopes

### Analysis API. Stubs and Decompilation
[`KT-80350`](https://youtrack.jetbrains.com/issue/KT-80350) Drop K1 decompiler
[`KT-77082`](https://youtrack.jetbrains.com/issue/KT-77082) StackOverflowError in CreateFreshTypeVariableSubstitutorStage.shouldBeFlexible
[`KT-80798`](https://youtrack.jetbrains.com/issue/KT-80798) Improve stubs tests coverage
[`KT-75318`](https://youtrack.jetbrains.com/issue/KT-75318) Read context parameter fields from metadata in CallableClsStubBuilder 
[`KT-77874`](https://youtrack.jetbrains.com/issue/KT-77874) AA disagrees with the compiler on descriptions of context parameters from binaries in messages for context argument ambiguity errors
[`KT-80276`](https://youtrack.jetbrains.com/issue/KT-80276) Implement native coping for stubs
[`KT-79780`](https://youtrack.jetbrains.com/issue/KT-79780) Decompiled MultifileClass has Facade kind
[`KT-79398`](https://youtrack.jetbrains.com/issue/KT-79398) isClsStubCompiledToJvmDefaultImplementation flag is inconsistent for compiled and decompiled stubs
[`KT-79798`](https://youtrack.jetbrains.com/issue/KT-79798) Prettify stub usages in LL stub-based deserializer
[`KT-78949`](https://youtrack.jetbrains.com/issue/KT-78949) AbstractLLStubBasedResolutionTest: tests against real stub-based files
[`KT-80251`](https://youtrack.jetbrains.com/issue/KT-80251) Inconsistent decompiled and compiled stub for properties with an initializer and a delegate
[`KT-74547`](https://youtrack.jetbrains.com/issue/KT-74547) Implement decompiler for K2
[`KT-79555`](https://youtrack.jetbrains.com/issue/KT-79555) Move KotlinFileStubImpl serialization/deserialization to the Analysis API
[`KT-79487`](https://youtrack.jetbrains.com/issue/KT-79487) "null DefinitelyNotNullType for 'T'" from decompiler
[`KT-60764`](https://youtrack.jetbrains.com/issue/KT-60764) Stub Builder: fix differences between K1 and K2 stub building on decompiled files
[`KT-79484`](https://youtrack.jetbrains.com/issue/KT-79484) An empty enum class with a member decompiles with a synthetic error
[`KT-79730`](https://youtrack.jetbrains.com/issue/KT-79730) Decompiled files have an extra `Kt` suffix
[`KT-79483`](https://youtrack.jetbrains.com/issue/KT-79483) data modifier is not present on object modifier
[`KT-75398`](https://youtrack.jetbrains.com/issue/KT-75398) Local classes from scripts have ClassId in stubs
[`KT-79412`](https://youtrack.jetbrains.com/issue/KT-79412) Context parameters with type annotations cause inconsistency errors while building stubs
[`KT-77097`](https://youtrack.jetbrains.com/issue/KT-77097) Support `ReplaceWith` deprecation annotation argument via stubs

### Analysis API. Surface
[`KT-80234`](https://youtrack.jetbrains.com/issue/KT-80234) Incorrect value of `isActual` for the implicitly `actual` constructor of annotation class
[`KT-78093`](https://youtrack.jetbrains.com/issue/KT-78093) Add bridges for context parameters
[`KT-79328`](https://youtrack.jetbrains.com/issue/KT-79328) K2 AA, isUsedAsExpression: Unhandled Non-KtExpression parent of KtExpression: class org.jetbrains.kotlin.psi.KtImportDirective
[`KT-80713`](https://youtrack.jetbrains.com/issue/KT-80713) Optimize KaDeclarationSymbol#visibility for class-like symbols
[`KT-80366`](https://youtrack.jetbrains.com/issue/KT-80366) IllegalStateException from KaFirStopWorldCacheCleaner
[`KT-80274`](https://youtrack.jetbrains.com/issue/KT-80274) Merge AbstractMultiModuleSymbolByPsiTest to AbstractSymbolByPsiTest
[`KT-80352`](https://youtrack.jetbrains.com/issue/KT-80352) KaBaseResolutionScope.contains(PsiElement) always returns false for Android light classes (e.g. synthetic R.java classes)
[`KT-80178`](https://youtrack.jetbrains.com/issue/KT-80178) Incorrect modality for an abstract interface function with a redundant `open` modifier
[`KT-64340`](https://youtrack.jetbrains.com/issue/KT-64340) Analysis API: no way to get a type of vararg parameter
[`KT-79129`](https://youtrack.jetbrains.com/issue/KT-79129) [Analysis API] `KaFe10TypeCreator.buildClassType` cannot build builtin types by class ids
[`KT-79143`](https://youtrack.jetbrains.com/issue/KT-79143) AA: `argumentMapping` contains an expression that is not an argument
[`KT-59857`](https://youtrack.jetbrains.com/issue/KT-59857) KaExpressionTypeProvider#returnType shouldn't throw an exception for class like declarations
[`KT-79667`](https://youtrack.jetbrains.com/issue/KT-79667) Enable resolve on java record components in standalone mode
[`KT-68387`](https://youtrack.jetbrains.com/issue/KT-68387) AA: provide context for type approximations
[`KT-73050`](https://youtrack.jetbrains.com/issue/KT-73050) `KaFirSymbolRelationProvider#expectsForActual`: suspicius logic for KaReceiverParameterSymbol
[`KT-78904`](https://youtrack.jetbrains.com/issue/KT-78904) KaBaseWriteActionStartedChecker throws when no additional WA was done
[`KT-79281`](https://youtrack.jetbrains.com/issue/KT-79281) Add KDoc to `KaTypePointer#restore`
[`KT-78597`](https://youtrack.jetbrains.com/issue/KT-78597) KaUseSiteVisibilityChecker returns false for internal functions exposed via implicit receiver
[`KT-71705`](https://youtrack.jetbrains.com/issue/KT-71705) FIR api impl: Postfix increment expression's `expressionType` is Unit when incrementing array element
[`KT-79097`](https://youtrack.jetbrains.com/issue/KT-79097) KaFirNamedFunctionSymbol#isSuspend shouldn't trigger resolution
[`KT-79095`](https://youtrack.jetbrains.com/issue/KT-79095) isOverride shouldn't trigger resolution if not compiler plugins present
[`KT-75057`](https://youtrack.jetbrains.com/issue/KT-75057) Analysis API: Reference to object through typealias in invoke operator call leads to original type

### Backend. JS
[`KT-79359`](https://youtrack.jetbrains.com/issue/KT-79359) Kotlin/JS: Suspending function doesn’t return Unit on es2015
[`KT-79089`](https://youtrack.jetbrains.com/issue/KT-79089) KJS: Could not load reporter / Cannot find module 'mocha' when running jsNode tests
[`KT-57128`](https://youtrack.jetbrains.com/issue/KT-57128) KJS: Use BigInt to represent Long values in ES6 mode
[`KT-56281`](https://youtrack.jetbrains.com/issue/KT-56281) KJS: Can't export suspend functions
[`KT-79926`](https://youtrack.jetbrains.com/issue/KT-79926) Wrong export of interfaces with companions with ES Modules
[`KT-80168`](https://youtrack.jetbrains.com/issue/KT-80168) Allow @JsStatic inside interface companions
[`KT-79284`](https://youtrack.jetbrains.com/issue/KT-79284) Use BigInt64Array for LongArray 
[`KT-70222`](https://youtrack.jetbrains.com/issue/KT-70222) Remove legacy JS BE-related CLI flags
[`KT-81424`](https://youtrack.jetbrains.com/issue/KT-81424) Kotlin/JS: Cannot Get / in a simple running application 
[`KT-80873`](https://youtrack.jetbrains.com/issue/KT-80873) KJS: Stdlib requires ES2020-compatible JS engine due to BigInt type literal
[`KT-72833`](https://youtrack.jetbrains.com/issue/KT-72833) KJS: Source maps have incorrect sources paths in `per-file`
[`KT-72474`](https://youtrack.jetbrains.com/issue/KT-72474) KJS: @JsPlainObject doesn't honour -XXLanguage:+JsAllowInvalidCharsIdentifiersEscaping
[`KT-79644`](https://youtrack.jetbrains.com/issue/KT-79644) BigInt enabled for ES 2015 despite being an ES 2020 feature
[`KT-52771`](https://youtrack.jetbrains.com/issue/KT-52771) KJS: Pair should be exported to JavaScript
[`KT-79704`](https://youtrack.jetbrains.com/issue/KT-79704) Unify variance rendering between JS and other backends
[`KT-69297`](https://youtrack.jetbrains.com/issue/KT-69297) Deprecate referencing inlineable lambdas in `js()` calls
[`KT-80086`](https://youtrack.jetbrains.com/issue/KT-80086) [k/js] Resolving imported string literals 
[`KT-79066`](https://youtrack.jetbrains.com/issue/KT-79066) [Kotlin/JS] jsNodeTest fails with SyntaxError when a test file has @file:JsExport and useEsModules() is enabled
[`KT-79394`](https://youtrack.jetbrains.com/issue/KT-79394) Add the possibility to write common external declarations between JS and WasmJS targets
[`KT-77385`](https://youtrack.jetbrains.com/issue/KT-77385) Investigate partial linkage problems for JS HMPP tests
[`KT-79628`](https://youtrack.jetbrains.com/issue/KT-79628) Remove IR nodes from ExportModel
[`KT-79916`](https://youtrack.jetbrains.com/issue/KT-79916) K/JS: "Uncaught TypeError" when using 'Xes-long-as-bigint' in compose-html
[`KT-79050`](https://youtrack.jetbrains.com/issue/KT-79050) KJS / IC: "Unexpected body of primary constructor for processing irClass"
[`KT-79977`](https://youtrack.jetbrains.com/issue/KT-79977) KJS: Long.rotateLeft returns incorrect result when BigInts are enabled
[`KT-78831`](https://youtrack.jetbrains.com/issue/KT-78831) AbstractFunctionReferencesLowering: fragile fake override generation
[`KT-52230`](https://youtrack.jetbrains.com/issue/KT-52230) KSJ IR: Applying identity equality operator to Longs always returns false
[`KT-6675`](https://youtrack.jetbrains.com/issue/KT-6675) KotlinJS: toInt() on external Long throws error
[`KT-79184`](https://youtrack.jetbrains.com/issue/KT-79184) K/JS: Further intrinsify BigInt-backed Long operations

### Backend. JVM
[`KT-80400`](https://youtrack.jetbrains.com/issue/KT-80400) K2: AbstractMethodError on fun interface implementation inheriting from an interface compiled with -jvm-default=disable
[`KT-79979`](https://youtrack.jetbrains.com/issue/KT-79979) K2: ClassCastException when overriding extension property with delegation
[`KT-80285`](https://youtrack.jetbrains.com/issue/KT-80285) IJ monorepo: broken compilation after 2.2.20-RC update
[`KT-80744`](https://youtrack.jetbrains.com/issue/KT-80744) Kotlin failure on lambda with type parameter
[`KT-81018`](https://youtrack.jetbrains.com/issue/KT-81018) ISE "IR class for Foo not found" on missing dependency when lowering SAM constructor
[`KT-80378`](https://youtrack.jetbrains.com/issue/KT-80378) ClassCastException on callable reference to a property with EBF
[`KT-62934`](https://youtrack.jetbrains.com/issue/KT-62934) Incorrect line mapping inside inline lambda after non-local return
[`KT-71306`](https://youtrack.jetbrains.com/issue/KT-71306) K2 IDE / Kotlin Debugger: “Cannot find local variable 'block' with type kotlin.jvm.functions.Function0” on evaluating lambda arg inside inline function
[`KT-79276`](https://youtrack.jetbrains.com/issue/KT-79276) Dexing fails with "Cannot read field X because <local0> is null" with 2.2.0
[`KT-79547`](https://youtrack.jetbrains.com/issue/KT-79547) "UnsupportedOperationException: Not supported" with inlining and value classes
[`KT-72039`](https://youtrack.jetbrains.com/issue/KT-72039) StackOverflowError on calling keySet on a Kotlin subclass of Java subclass of ConcurrentHashMap
[`KT-75843`](https://youtrack.jetbrains.com/issue/KT-75843) K2: incorrect line numbers in an if-expression with a super-call

### Backend. JVM. Coroutines
[`KT-48311`](https://youtrack.jetbrains.com/issue/KT-48311) Incorrect LINENUMBER after if with a suspend call
[`KT-80688`](https://youtrack.jetbrains.com/issue/KT-80688) Bad SourceDebugExtension caused by enhanced coroutines debugging
[`KT-79442`](https://youtrack.jetbrains.com/issue/KT-79442) "Multiple annotations of type kotlin.coroutines.jvm.internal.DebugMetadata": 2.2.0-Beta1 generates broken code with JVM default suspend methods in interfaces
[`KT-79682`](https://youtrack.jetbrains.com/issue/KT-79682) Fix partially uninitialized locals after coroutine spills insertion
[`KT-79354`](https://youtrack.jetbrains.com/issue/KT-79354) IllegalStateException: Debug metadata version mismatch. Expected: 1, got 2 with compiler 2.2.20-Beta1 and stdlib 2.2.0
[`KT-63720`](https://youtrack.jetbrains.com/issue/KT-63720) Coroutine debugger: do not optimise out local variables

### Backend. JVM. Inline
[`KT-76991`](https://youtrack.jetbrains.com/issue/KT-76991) K2 IDE / Kotlin Debugger: ISE “Couldn't find declaration file for” on evaluating local fun when the scope has also inline fun from another file call

### Backend. Native
[`KT-77676`](https://youtrack.jetbrains.com/issue/KT-77676) K/N: enable typechecks and the casts optimization pass in debug mode by default
[`KT-80554`](https://youtrack.jetbrains.com/issue/KT-80554) Kotlin/Native: investigate performance hit from always-on llvm pass profiling
[`KT-80711`](https://youtrack.jetbrains.com/issue/KT-80711) IC Native: NPE during link on ktor
[`KT-81257`](https://youtrack.jetbrains.com/issue/KT-81257) Native: "Unexpected boolean predicate" when generating 'static_cache'
[`KT-81340`](https://youtrack.jetbrains.com/issue/KT-81340) K/N: severe compilation time degradation after turning on casts optimization pass
[`KT-75797`](https://youtrack.jetbrains.com/issue/KT-75797) Native: find a way to handle generates C bridges in inline functions
[`KT-80003`](https://youtrack.jetbrains.com/issue/KT-80003) Kotlin/Native: deprecate eager GlobalData initialization
[`KT-80795`](https://youtrack.jetbrains.com/issue/KT-80795) Wrong type cast is added for IMPLICIT_COERCION_TO_UNIT
[`KT-81057`](https://youtrack.jetbrains.com/issue/KT-81057) Wrong handling of boxing during redundant casts optimization
[`KT-81064`](https://youtrack.jetbrains.com/issue/KT-81064) Wrong safe call null check handling during redundant casts optimization
[`KT-72862`](https://youtrack.jetbrains.com/issue/KT-72862) [Native caches] Umbrella for failing codegen/box tests for corner cases in synthetic accessors
[`KT-79380`](https://youtrack.jetbrains.com/issue/KT-79380) Native: add performance measurement for the rest of backend phases
[`KT-80370`](https://youtrack.jetbrains.com/issue/KT-80370) Add NO_INLINE attribute to some of runtime functions
[`KT-80167`](https://youtrack.jetbrains.com/issue/KT-80167) K/N: condense the nodes and edges in DevirtualizationAnalysis constraint graph
[`KT-73851`](https://youtrack.jetbrains.com/issue/KT-73851) Native: compilation fails with ClassCastException with genericSafeCasts=true
[`KT-79381`](https://youtrack.jetbrains.com/issue/KT-79381) Native: add performance measurement of LLVM phases
[`KT-79785`](https://youtrack.jetbrains.com/issue/KT-79785) ktypew:kotlin.collections.List already exists error using Swift Export
[`KT-79092`](https://youtrack.jetbrains.com/issue/KT-79092) Crash on default argument in function in fun interface
[`KT-77685`](https://youtrack.jetbrains.com/issue/KT-77685) "IllegalArgumentException: Sequence contains more than one matching element"
[`KT-61384`](https://youtrack.jetbrains.com/issue/KT-61384) IrFakeOverrideBuilder incorrectly checks visibility for friend modules

### Backend. Native. Debug
[`KT-79848`](https://youtrack.jetbrains.com/issue/KT-79848) Flaky debugger tests in opt.debug/cache.*/GC.CMS/GC.sch.ad/alloc.custom configuration

### Backend. Wasm
[`KT-79357`](https://youtrack.jetbrains.com/issue/KT-79357) K/Wasm: store data for string literals in utf8 for Latin1
[`KT-69621`](https://youtrack.jetbrains.com/issue/KT-69621) K/Wasm: Consider enabling support for KClass.qualifiedName by default
[`KT-80018`](https://youtrack.jetbrains.com/issue/KT-80018) K/Wasm: exceptions don't work properly in JavaScriptCore (vm inside Safari, WebKit)
[`KT-66072`](https://youtrack.jetbrains.com/issue/KT-66072) K/Wasm: improve how exceptions work in JS interop
[`KT-80106`](https://youtrack.jetbrains.com/issue/KT-80106) devServer in Kotlin/Wasm overwrites defaults, causing missing static paths
[`KT-80210`](https://youtrack.jetbrains.com/issue/KT-80210) Wasm: "Unexpected non-external class: kotlin.Nothing" caused by JsExport with JsPromise
[`KT-80555`](https://youtrack.jetbrains.com/issue/KT-80555) WASM IC: Can't link symbol on kotlinx.coroutines on fresh master
[`KT-80415`](https://youtrack.jetbrains.com/issue/KT-80415) WasmJs Number Elvis Operator Crash
[`KT-59032`](https://youtrack.jetbrains.com/issue/KT-59032) Support instantiation of annotation classes on WASM
[`KT-76509`](https://youtrack.jetbrains.com/issue/KT-76509) WasmJS: ReferenceError: Temporal is not defined caused by "Redundant reference to unused external results"
[`KT-79317`](https://youtrack.jetbrains.com/issue/KT-79317) [Wasm] Do not throw CCE for ExcludedFromCodegen declarations
[`KT-78036`](https://youtrack.jetbrains.com/issue/KT-78036) K/Wasm: generate a message with "expected" and "actual" types in case of CCE

### Binary Metadata
[`KT-75748`](https://youtrack.jetbrains.com/issue/KT-75748) StackOverflowError when reading array from metadata annotations
[`KT-80597`](https://youtrack.jetbrains.com/issue/KT-80597) Apply fix for CVE-2024-7254 to our fork of protobuf 2.6.1

### Frontend
[`KT-81068`](https://youtrack.jetbrains.com/issue/KT-81068) Corrupted Unicode paths passed or used in the compiler
[`KT-76343`](https://youtrack.jetbrains.com/issue/KT-76343) Drop language version 1.8
[`KT-78280`](https://youtrack.jetbrains.com/issue/KT-78280) Implement the sourceless `KtDiagnostic`s
[`KT-79185`](https://youtrack.jetbrains.com/issue/KT-79185) Support local type aliases
[`KT-79274`](https://youtrack.jetbrains.com/issue/KT-79274) Frontend implementation of name-based destructuring
[`KT-76136`](https://youtrack.jetbrains.com/issue/KT-76136) Switch latest stable version in Kotlin project to 2.3
[`KT-80524`](https://youtrack.jetbrains.com/issue/KT-80524) Class is not abstract and does not implement abstract member when compiling with kotlinc-jklib
[`KT-79693`](https://youtrack.jetbrains.com/issue/KT-79693) NotImplementedError: An operation is not implemented: Unknown file with KMP separate compilation
[`KT-78389`](https://youtrack.jetbrains.com/issue/KT-78389) Perform version 2.3 boostrapping
[`KT-78452`](https://youtrack.jetbrains.com/issue/KT-78452) Drop redundant frontend structures after fir2ir conversion

### Frontend. Checkers
[`KT-78881`](https://youtrack.jetbrains.com/issue/KT-78881) K2: False positive "Assigned value is never read" in composable function
[`KT-80461`](https://youtrack.jetbrains.com/issue/KT-80461) K2: false positive NO_ELSE_IN_WHEN for complex sealed hierarchy
[`KT-78819`](https://youtrack.jetbrains.com/issue/KT-78819) K2: False positive ABSTRACT_MEMBER_NOT_IMPLEMENTED in KJK hierarchy
[`KT-80768`](https://youtrack.jetbrains.com/issue/KT-80768) Warning on overloading by a superset of context parameters in class context
[`KT-78125`](https://youtrack.jetbrains.com/issue/KT-78125) false-negative shadowed contextual overload warning on local declarations
[`KT-80936`](https://youtrack.jetbrains.com/issue/KT-80936) NON_PUBLIC_CALL_FROM_PUBLIC_INLINE : `@PublishedApi` doesn't work for fun interfaces
[`KT-80606`](https://youtrack.jetbrains.com/issue/KT-80606) KotlinIllegalArgumentExceptionWithAttachments when using property itself in explicit backing field initialization
[`KT-80538`](https://youtrack.jetbrains.com/issue/KT-80538) KaFirDiagnostic.EmptyRange doesn't work in most of the cases
[`KT-80735`](https://youtrack.jetbrains.com/issue/KT-80735) Support || return/throw shortcut in unsed return value checker
[`KT-79651`](https://youtrack.jetbrains.com/issue/KT-79651) Report a warning about an unused return value only on the function name
[`KT-80719`](https://youtrack.jetbrains.com/issue/KT-80719) False positive: "Redundant visibility modifier": when overriding protected methods as "public"
[`KT-80383`](https://youtrack.jetbrains.com/issue/KT-80383) Getter without a body is allowed on a property with an explicit backing field
[`KT-80446`](https://youtrack.jetbrains.com/issue/KT-80446) Explicit visibility modifiers are allowed on EBF
[`KT-80455`](https://youtrack.jetbrains.com/issue/KT-80455) K2: StackOverflowError in when exhaustiveness checker on red code
[`KT-80469`](https://youtrack.jetbrains.com/issue/KT-80469) Functional type from property is always used for explicit backing field
[`KT-80535`](https://youtrack.jetbrains.com/issue/KT-80535) Missing INITIALIZER_TYPE_MISMATCH for EBF 
[`KT-80445`](https://youtrack.jetbrains.com/issue/KT-80445) Private visibility is possible for a property with EBF
[`KT-80684`](https://youtrack.jetbrains.com/issue/KT-80684) Line breaks are lost in multi-line diagnostic messages since 2.3.0
[`KT-78112`](https://youtrack.jetbrains.com/issue/KT-78112) RETURN_VALUE_NOT_USED is reported for local function even if it isn't marked with annotation in CHECKER mode
[`KT-77593`](https://youtrack.jetbrains.com/issue/KT-77593) Add a warning when @IgnorableReturnValue is inconsistent between expect/actual functions
[`KT-79386`](https://youtrack.jetbrains.com/issue/KT-79386) Confusing error message when named parameters are used for java method calls
[`KT-80600`](https://youtrack.jetbrains.com/issue/KT-80600) K2: Private and final modifiers are allowed on setter of open delegated property
[`KT-77101`](https://youtrack.jetbrains.com/issue/KT-77101) Invoke on callable reference is considered ignorable
[`KT-79923`](https://youtrack.jetbrains.com/issue/KT-79923) Remove lookup of @IgnorableReturnValue annotation from FirReturnValueOverrideChecker
[`KT-80517`](https://youtrack.jetbrains.com/issue/KT-80517) Synthetic kotlin.Any members in data classes are missing @MustUseReturnValue
[`KT-80194`](https://youtrack.jetbrains.com/issue/KT-80194) VAR_TYPE_MISMATCH_ON_OVERRIDE: doesn't mention the inferred type
[`KT-80484`](https://youtrack.jetbrains.com/issue/KT-80484) K2: ClassCastException due to fake source for implicit lambda parameter (RedundantNullableChecker)
[`KT-80399`](https://youtrack.jetbrains.com/issue/KT-80399) Anonymous Kotlin class incorrectly warns about deprecated java override despite '@Deprecated' annotation
[`KT-79496`](https://youtrack.jetbrains.com/issue/KT-79496) False positive "when must be exhaustive" in triangle interface/class hierarchy
[`KT-80222`](https://youtrack.jetbrains.com/issue/KT-80222) Implement the prohibition of always-false `is` checks for definitely incompatible types
[`KT-80391`](https://youtrack.jetbrains.com/issue/KT-80391) K2: Only one context parameter is mentioned in the [NO_CONTEXT_ARGUMENT] diagnostic
[`KT-74810`](https://youtrack.jetbrains.com/issue/KT-74810) Support typealiased/mapped Java types in unused return value checker
[`KT-78879`](https://youtrack.jetbrains.com/issue/KT-78879) "Sealed types cannot be instantiated": Can't instantiate Java-defined sealed Class from Kotlin
[`KT-21598`](https://youtrack.jetbrains.com/issue/KT-21598) Extension is shadowed by member should not be reported when member is deprecated with HIDDEN level
[`KT-79622`](https://youtrack.jetbrains.com/issue/KT-79622) FUNCTION_EXPECTED: Misleading 'expression cannot be invoked as a function' when inaccessible with private lambda
[`KT-80255`](https://youtrack.jetbrains.com/issue/KT-80255) [EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION] can be attached to the receiver type of a functional type
[`KT-80177`](https://youtrack.jetbrains.com/issue/KT-80177) Improve message of RECEIVER_SHADOWED_BY_CONTEXT_PARAMETER in case of member extension
[`KT-79430`](https://youtrack.jetbrains.com/issue/KT-79430) False positive EXTENSION_SHADOWED_BY_MEMBER on overridden member extension
[`KT-79545`](https://youtrack.jetbrains.com/issue/KT-79545) K2: no error on crossinline lambda usage in anonymous object base constructor call
[`KT-79643`](https://youtrack.jetbrains.com/issue/KT-79643) HAS_NEXT_FUNCTION_AMBIGUITY and NEXT_AMBIGUITY diagnostics are always ignored in favor of HAS_NEXT_FUNCTION_NONE_APPLICABLE and NEXT_NONE_APPLICABLE
[`KT-79327`](https://youtrack.jetbrains.com/issue/KT-79327) Modifier 'private' is not applicable to 'value parameter' is reported for context parameters
[`KT-77182`](https://youtrack.jetbrains.com/issue/KT-77182) A function in a file annotated with @file:MustUseReturnValue doesn't produce a warning when it is used from compiled code
[`KT-71244`](https://youtrack.jetbrains.com/issue/KT-71244) Incorporate existing @CheckReturnValue annotation(s) into Kotlin's unused return value checker
[`KT-79922`](https://youtrack.jetbrains.com/issue/KT-79922) Record 'MustUse/ExplicitlyIgnorable' state for overrides even in disabled RVC mode
[`KT-79920`](https://youtrack.jetbrains.com/issue/KT-79920) Store 'Explicitly ignorable' state of function/property in the metadata
[`KT-79690`](https://youtrack.jetbrains.com/issue/KT-79690) Implement a USELESS_ELVIS_LEFT_IS_NULL with elvis expression
[`KT-79662`](https://youtrack.jetbrains.com/issue/KT-79662) Unused return value checker doesn't work for com.google.errorprone.annotations.CheckReturnValue
[`KT-79781`](https://youtrack.jetbrains.com/issue/KT-79781) Missing MISSING_DEPENDENCY_CLASS when using type alias with inaccessible RHS
[`KT-77772`](https://youtrack.jetbrains.com/issue/KT-77772) Only report exposed type on qualifier if it's resolved to an object
[`KT-79765`](https://youtrack.jetbrains.com/issue/KT-79765) K2. Do not report ignore return value for unresolved reference
[`KT-79017`](https://youtrack.jetbrains.com/issue/KT-79017) False negative REDECLARATION on private nested class
[`KT-79296`](https://youtrack.jetbrains.com/issue/KT-79296) Implement/adapt diagnostics for new destructuring 
[`KT-79298`](https://youtrack.jetbrains.com/issue/KT-79298) Report errors on new destructuring syntax in K1
[`KT-77504`](https://youtrack.jetbrains.com/issue/KT-77504) Add a warning when @IgnorableReturnValue is inconsistent on overrides
[`KT-79013`](https://youtrack.jetbrains.com/issue/KT-79013) False negative `NOT_YET_SUPPORTED_IN_INLINE` on inline local functions inside inline functions
[`KT-42096`](https://youtrack.jetbrains.com/issue/KT-42096) No diagnostic reported on `inline` modifier on an enum entry
[`KT-79218`](https://youtrack.jetbrains.com/issue/KT-79218) SMARTCAST_IMPOSSIBLE for top‑level extension‑property getter despite returnsNotNull contract
[`KT-79220`](https://youtrack.jetbrains.com/issue/KT-79220) returnsNotNull contract ignored on extension function with nullable receiver
[`KT-77986`](https://youtrack.jetbrains.com/issue/KT-77986) K2: False negative: "Local classes are not yet supported in inline functions"
[`KT-79456`](https://youtrack.jetbrains.com/issue/KT-79456) Redeclaration conflict checks of private top-level classifiers rely on an incorrect containing file
[`KT-79125`](https://youtrack.jetbrains.com/issue/KT-79125) RVC full mode: delegated interfaces are not checked
[`KT-59807`](https://youtrack.jetbrains.com/issue/KT-59807) K2: Replicate the MUST_BE_LATEINIT logic from K1
[`KT-78066`](https://youtrack.jetbrains.com/issue/KT-78066) TYPE_PARAMETER_OF_PROPERTY_NOT_USED_IN_RECEIVER error message does not account for context parameters
[`KT-24202`](https://youtrack.jetbrains.com/issue/KT-24202) NOTHING_TO_OVERRIDE  if super-class reference misses generic arguments
[`KT-78909`](https://youtrack.jetbrains.com/issue/KT-78909) K2: Missing diagnostics [CYCLIC_INHERITANCE_HIERARCHY] for recursive class inheritance leads to StackOverflowError
[`KT-75969`](https://youtrack.jetbrains.com/issue/KT-75969) java.lang.IllegalArgumentException: source must not be null on red code
[`KT-76902`](https://youtrack.jetbrains.com/issue/KT-76902) Omit type-use annotations from diagnostics
[`KT-17460`](https://youtrack.jetbrains.com/issue/KT-17460) Diagnostics and intention on suspend function that is overriden with non-suspend one.
[`KT-78932`](https://youtrack.jetbrains.com/issue/KT-78932) Contracts are allowed for open and overridden property accessors
[`KT-77203`](https://youtrack.jetbrains.com/issue/KT-77203) FIR: Consider adding destructured type to all COMPONENT_FUNCTION_* diagnostics 

### Frontend. Control-flow analysis
[`KT-80864`](https://youtrack.jetbrains.com/issue/KT-80864) K2: Missing `Val cannot be reassigned` diagnostic for Java final fields (crashes in runtime with `IllegalAccessError`)
[`KT-78664`](https://youtrack.jetbrains.com/issue/KT-78664) False positive VARIABLE_NEVER_READ and ASSIGNED_VALUE_IS_NEVER_READ on function type variable with splited declaration and assignment

### Frontend. Data-flow analysis
[`KT-81547`](https://youtrack.jetbrains.com/issue/KT-81547) Stabilize DFA-based exhaustiveness
[`KT-79672`](https://youtrack.jetbrains.com/issue/KT-79672) 'when expression must be exhaustive' even after using 'require()'
[`KT-79355`](https://youtrack.jetbrains.com/issue/KT-79355) Failed to fix the problem of desugared `inc` with new reverse implies returns contract
[`KT-79277`](https://youtrack.jetbrains.com/issue/KT-79277) Implies returns contract doesn't affect the return type of the function if it is in the argument position
[`KT-79271`](https://youtrack.jetbrains.com/issue/KT-79271) Implies returns contract doesn't impact exhaustiveness
[`KT-78595`](https://youtrack.jetbrains.com/issue/KT-78595) type variable leak on a generic property as a call argument given an unstable smart cast

### Frontend. FIR tree
[`KT-80164`](https://youtrack.jetbrains.com/issue/KT-80164) Move name generation for unnamed context parameters to frontend
[`KT-78895`](https://youtrack.jetbrains.com/issue/KT-78895) Consider dropping isLocalInFunction and FirClassLikeDeclaration.isLocal
[`KT-60886`](https://youtrack.jetbrains.com/issue/KT-60886) K2: Fix `testDirectoryWithRelativePath` in LV 2.0 branch

### Frontend. FIR2IR
[`KT-79887`](https://youtrack.jetbrains.com/issue/KT-79887) K2 Compiler Internal Error in 'FirFakeOverrideGenerator.checkStatusIsResolved' Method
[`KT-80940`](https://youtrack.jetbrains.com/issue/KT-80940) K2: Exception in FIR2IR with AnnotationTarget.TYPE with self-annotated non-vararg default argument and usage in child module
[`KT-80849`](https://youtrack.jetbrains.com/issue/KT-80849) K2: `ConstValueProviderImpl` doesn't distinguish files with same name and package
[`KT-80377`](https://youtrack.jetbrains.com/issue/KT-80377) Fir2Ir: "Cannot determine expected receiver type" for callable reference to a property with EBF outside of class
[`KT-79610`](https://youtrack.jetbrains.com/issue/KT-79610) Adding CocoaPod to Kotlin/Native MPP triggers IR serialization failure and commonizer errors
[`KT-79877`](https://youtrack.jetbrains.com/issue/KT-79877) K2 IDE / Kotlin Debugger: failed evaluations of a code fragment capturing local data class
[`KT-79562`](https://youtrack.jetbrains.com/issue/KT-79562) NPE when passing non-lambda argument of nullable non-suspend function type into function that accepts nullable suspend function type
[`KT-60248`](https://youtrack.jetbrains.com/issue/KT-60248) K2: Type abbreviations are not stored in IR

### Frontend. Lexer & Parser
[`KT-79783`](https://youtrack.jetbrains.com/issue/KT-79783) KDoc parser: Links aren't rendered if the line has an indent of 4 or more
[`KT-75215`](https://youtrack.jetbrains.com/issue/KT-75215) KDoc: references from @param tag are rendered as plain text
[`KT-79951`](https://youtrack.jetbrains.com/issue/KT-79951) Infinite loop in parsing incomplete full form destructuring
[`KT-79774`](https://youtrack.jetbrains.com/issue/KT-79774) KtDestructuringDeclaration.getLPar & getRPar are broken
[`KT-79295`](https://youtrack.jetbrains.com/issue/KT-79295) Parse and build raw FIR from new short and full forms of positional destructuring with square brackets

### Frontend. Resolution and Inference
[`KT-80330`](https://youtrack.jetbrains.com/issue/KT-80330) K2: NPE at org.jetbrains.kotlin.fir.resolve.calls.FirCallResolver.createResolvedNamedReference
[`KT-58988`](https://youtrack.jetbrains.com/issue/KT-58988) K2: Deprecate exposing package-private parameter of internal method
[`KT-80602`](https://youtrack.jetbrains.com/issue/KT-80602) Exhaustiveness checker improvements for 2.3
[`KT-80434`](https://youtrack.jetbrains.com/issue/KT-80434) K2: DSL marker doesn't work with lambda fields
[`KT-20278`](https://youtrack.jetbrains.com/issue/KT-20278) NO_TYPE_ARGUMENTS_ON_RHS: Confusing diagnostic for inner class of generic outer class
[`KT-80418`](https://youtrack.jetbrains.com/issue/KT-80418) Property with EBF with functional type isn't resolved if its type is Any
[`KT-80592`](https://youtrack.jetbrains.com/issue/KT-80592) `UninitializedPropertyAccessException` when anayzing annotations on members of anonymous classes
[`KT-79866`](https://youtrack.jetbrains.com/issue/KT-79866) kotlinc 2.2.0 silently emits 'NonExistentClass' instead of reporting an error
[`KT-79777`](https://youtrack.jetbrains.com/issue/KT-79777) Argument type mismatch on value of complex type with a captured raw type argument
[`KT-79770`](https://youtrack.jetbrains.com/issue/KT-79770) There is no RECEIVER_SHADOWED_BY_CONTEXT_PARAMETER if the usage of fun is from inside the class
[`KT-76453`](https://youtrack.jetbrains.com/issue/KT-76453) K2 IDE: autocomplete freeze
[`KT-77401`](https://youtrack.jetbrains.com/issue/KT-77401) [FIR] `ParameterNameTypeAttribute.name` doesn't support `@ParameterName` with compile-time constant property argument
[`KT-79519`](https://youtrack.jetbrains.com/issue/KT-79519) Nested type alias is unreachable from another module
[`KT-79451`](https://youtrack.jetbrains.com/issue/KT-79451) Rework approach to recursive types approximation
[`KT-79535`](https://youtrack.jetbrains.com/issue/KT-79535) Revert incorrect SAM conversion enhancements brought to K2
[`KT-79139`](https://youtrack.jetbrains.com/issue/KT-79139) False positive CONFLICTING_OVERLOADS for context parameters instead of receivers
[`KT-35305`](https://youtrack.jetbrains.com/issue/KT-35305) Address the overload conflict resolution between unsigned and non-primitive types
[`KT-79076`](https://youtrack.jetbrains.com/issue/KT-79076) 'IllegalStateException: Cannot serialize error type: ERROR CLASS: Uninferred type' with Exposed column using recursive generic type
[`KT-76782`](https://youtrack.jetbrains.com/issue/KT-76782) K2: Incorrect resolve into unrelated invoke operator with wrong diagnostic
[`KT-77808`](https://youtrack.jetbrains.com/issue/KT-77808) Inference: recheck the code about DNN-related hacks
[`KT-56665`](https://youtrack.jetbrains.com/issue/KT-56665) K2: false positive RECURSIVE_TYPEALIAS_EXPANSION

### IDE. Gradle Integration
[`KT-46273`](https://youtrack.jetbrains.com/issue/KT-46273) MPP: Don't fail import for case of missed platform in source set structure
[`KT-46417`](https://youtrack.jetbrains.com/issue/KT-46417) [UNRESOLVED_REFERENCE] For project to project dependencies of native platform test source sets
[`KT-44845`](https://youtrack.jetbrains.com/issue/KT-44845) After update to Kotlin 1.4.30 all external dependencies is unresolved in IDE with kotlin.mpp.enableGranularSourceSetsMetadata=true
[`KT-46142`](https://youtrack.jetbrains.com/issue/KT-46142) K/N distribution is unavailable from IDE with multiplatform hierarchical project structure enabled

### IR. Actualizer
[`KT-77337`](https://youtrack.jetbrains.com/issue/KT-77337) `IrNoExpectSymbolsHandler` finds expect class reference after enabling annotation traversal in IR
[`KT-80002`](https://youtrack.jetbrains.com/issue/KT-80002) Investigate the need for map copying in IrCommonToPlatformDependencyExtractor.kt
[`KT-80131`](https://youtrack.jetbrains.com/issue/KT-80131) KMP Separate Compilation: No override for FUN IR_EXTERNAL_DECLARATION_STUB name:<get-size>
[`KT-80064`](https://youtrack.jetbrains.com/issue/KT-80064) KMP Separate Compilation: ClassCastException: class org.jetbrains.kotlin.ir.symbols.impl.IrTypeAliasSymbolImpl cannot be cast to class org.jetbrains.kotlin.ir.symbols.IrClassSymbol
[`KT-80051`](https://youtrack.jetbrains.com/issue/KT-80051) KMP Separate Compilation: Actualization of common dependencies failed on 'PROPERTY FAKE_OVERRIDE name:modCount visibility:protected modality:FINAL [fake_override,var]'
[`KT-79998`](https://youtrack.jetbrains.com/issue/KT-79998) KMP Separate Compilation: java.lang.IllegalStateException: No override for FUN IR_EXTERNAL_DECLARATION_STUB name:<get-message>

### IR. Inlining
[`KT-80653`](https://youtrack.jetbrains.com/issue/KT-80653) [IR Inliner] Space: "Local declarations should've been popped out by this point" 
[`KT-78392`](https://youtrack.jetbrains.com/issue/KT-78392) CommonPrefix: Add a way of stopping execution when one of the phases is unsuccessful 
[`KT-79334`](https://youtrack.jetbrains.com/issue/KT-79334) Unify intrinsics used on 1st phase of IR inliner in KLIB-based compilers 
[`KT-80610`](https://youtrack.jetbrains.com/issue/KT-80610) KLIB inliner: Always apply cross-module inlining to pre-processed inline functions
[`KT-80565`](https://youtrack.jetbrains.com/issue/KT-80565) KLIB Inliner: Add a special annotation to prohibit inlining of marked inline functions in stdlib on 1st compilation phase
[`KT-80883`](https://youtrack.jetbrains.com/issue/KT-80883) [Inliner] Run pre-serialization lowerings in all testrunners
[`KT-77876`](https://youtrack.jetbrains.com/issue/KT-77876) IrVisibilityChecker: Different set of exceptions for 1st and 2nd compilation stages
[`KT-80693`](https://youtrack.jetbrains.com/issue/KT-80693) [IC] Split IC invalidation tests for cross-module IR Inliner
[`KT-79718`](https://youtrack.jetbrains.com/issue/KT-79718) KLIB inliner: Emit warning on generation of `public` synthetic accessor when running in "explicit API mode"
[`KT-80226`](https://youtrack.jetbrains.com/issue/KT-80226) [IR Inliner] Generate constructor accessors as constructors, not static functions
[`KT-80692`](https://youtrack.jetbrains.com/issue/KT-80692) [IC] Split IC invalidation tests for intra-module IR Inliner
[`KT-77103`](https://youtrack.jetbrains.com/issue/KT-77103) [Inliner] IrLocalDelegatedProperty was not serialized, while its symbol and IrRichPropertyReference were.
[`KT-70360`](https://youtrack.jetbrains.com/issue/KT-70360) KLIBs: Uniformly handle`typeOf()` calls at 1st/2nd stages of compilation
[`KT-80537`](https://youtrack.jetbrains.com/issue/KT-80537) The expected error is not emitted from FirJsKlibSyntheticAccessorsTestGenerated and NativeKlibSyntheticAccessorsTestGenerated
[`KT-69497`](https://youtrack.jetbrains.com/issue/KT-69497) Crossinline lambda is allocated on K/N & JS
[`KT-78903`](https://youtrack.jetbrains.com/issue/KT-78903) Unify `codegen/boxInline` tests with  `codegen/box`
[`KT-78989`](https://youtrack.jetbrains.com/issue/KT-78989) Add missing PL tests for inline functions/property accessors
[`KT-79771`](https://youtrack.jetbrains.com/issue/KT-79771) kotlinx-coroutines-core: Public synthetic accessor generated with enabled KLIB IR inliner
[`KT-79680`](https://youtrack.jetbrains.com/issue/KT-79680) `IrConstructorSymbolImpl is unbound` in lambdaWithoutNonLocalControlflow.kt
[`KT-70849`](https://youtrack.jetbrains.com/issue/KT-70849) Ensure correct debug info for intra-module IR inlining on the first compilation phase
[`KT-79800`](https://youtrack.jetbrains.com/issue/KT-79800) JS BE errors with default values when IR inliner is enabled
[`KT-79352`](https://youtrack.jetbrains.com/issue/KT-79352) Remove excessive validations from `ValidateAfterAll...` on the first stage
[`KT-76599`](https://youtrack.jetbrains.com/issue/KT-76599) Migrate `IrValidationAfterInliningAllFunctionsPhase` to the first stage of compilation
[`KT-78245`](https://youtrack.jetbrains.com/issue/KT-78245) Synthetic Accessors incorrectly copies default values
[`KT-72594`](https://youtrack.jetbrains.com/issue/KT-72594) [JS][Native] Add IrInliningFacade to test runners

### IR. Interpreter
[`KT-72881`](https://youtrack.jetbrains.com/issue/KT-72881) K2: incorrect empty array as annotation argument when parameter has default value

### IR. Tree
[`KT-77819`](https://youtrack.jetbrains.com/issue/KT-77819) [IR] Fine-tune IrValidator's run after Fir2IR and IR plugins
[`KT-70160`](https://youtrack.jetbrains.com/issue/KT-70160) Remove IrDeclaration.parents after Anvil update
[`KT-80454`](https://youtrack.jetbrains.com/issue/KT-80454) LocalDeclarationsLowering: Clean-up the dead code
[`KT-80819`](https://youtrack.jetbrains.com/issue/KT-80819) Rework IrFileValidator to use Hashmap instead of ClassValue
[`KT-80516`](https://youtrack.jetbrains.com/issue/KT-80516) Kotlin-like IR dump: Don't render tailrec as lateinit
[`KT-79439`](https://youtrack.jetbrains.com/issue/KT-79439) KLIB stdlib symbols loading: Split the result of merging of IrBuiltins with BuiltinSymbolsBase hierarchy into two parts (for 1st & 2nd phases)
[`KT-79437`](https://youtrack.jetbrains.com/issue/KT-79437) KLIB stdlib symbols loading: Drop loading functions from IrBuiltins and migrate usages to SymbolFinder functions and lazy filtering
[`KT-79569`](https://youtrack.jetbrains.com/issue/KT-79569) Unexpected error during DFG phase in Native due to PL issue with SAM conversion represented by rich reference
[`KT-79371`](https://youtrack.jetbrains.com/issue/KT-79371) Fix handling of broken SAM conversion in PL with enabled Rich References
[`KT-76601`](https://youtrack.jetbrains.com/issue/KT-76601) IrValidatorConfig should have all checks disabled by default
[`KT-69662`](https://youtrack.jetbrains.com/issue/KT-69662) Deduplicate function `createTemporaryVariable`
[`KT-79440`](https://youtrack.jetbrains.com/issue/KT-79440) KLIB stdlib symbols loading: Drop BuiltinSymbolsBase from plugin API
[`KT-78960`](https://youtrack.jetbrains.com/issue/KT-78960) [FO] Limit static fake overrides generation for static functions
[`KT-76813`](https://youtrack.jetbrains.com/issue/KT-76813) IR validator: not all symbols/references are visited

### JVM. Reflection
[`KT-79020`](https://youtrack.jetbrains.com/issue/KT-79020) Suspend lambdas return type is shown as ??? in reflection
[`KT-76521`](https://youtrack.jetbrains.com/issue/KT-76521) Reflection: change KType representation to avoid dependency on K1
[`KT-74529`](https://youtrack.jetbrains.com/issue/KT-74529) Context parameters support in reflection
[`KT-80901`](https://youtrack.jetbrains.com/issue/KT-80901) Reflection: incorrect translation of raw types in the new implementation
[`KT-74624`](https://youtrack.jetbrains.com/issue/KT-74624) Reflection: KClassifier.createType(...) ignores annotations parameter
[`KT-80203`](https://youtrack.jetbrains.com/issue/KT-80203) Reflection: provide a way to use legacy K1-based implementation
[`KT-80236`](https://youtrack.jetbrains.com/issue/KT-80236) Reflection: KType.toString for raw types no longer renders "(raw)"
[`KT-79206`](https://youtrack.jetbrains.com/issue/KT-79206) Reflection: suspend functional type classifier is null

### Java Descriptors and Signatures
[`KT-79816`](https://youtrack.jetbrains.com/issue/KT-79816) Java Interfaces implemented by delegation have non-null return checks
[`KT-78541`](https://youtrack.jetbrains.com/issue/KT-78541) Jspecify: Unsound platform type despite `@NullMarked` for an override with a generic-subclass return type
[`KT-77729`](https://youtrack.jetbrains.com/issue/KT-77729) Package-level @NullMarked does not work when kotlinc sees .java *source* files
[`KT-76065`](https://youtrack.jetbrains.com/issue/KT-76065) Drop JavaTypeParameterDefaultRepresentationWithDNN feature

### Klibs
[`KT-80099`](https://youtrack.jetbrains.com/issue/KT-80099) KLIB resolver: Could not find file because of missing `klib` extension in resolved symlink path
[`KT-80298`](https://youtrack.jetbrains.com/issue/KT-80298) K/N: one-stage compilation is broken
[`KT-80861`](https://youtrack.jetbrains.com/issue/KT-80861) [Klib] Deduplicate IrFileEntry.name
[`KT-80866`](https://youtrack.jetbrains.com/issue/KT-80866) [Klib] Optimize size of IrFileEntry.line_start_offset
[`KT-80438`](https://youtrack.jetbrains.com/issue/KT-80438) Uncached KlibMetadataClassDataFinder.findClassData
[`KT-79958`](https://youtrack.jetbrains.com/issue/KT-79958) KLIB tool fails to render IR if there is IrErrorType in a lirbrary
[`KT-75241`](https://youtrack.jetbrains.com/issue/KT-75241) Move ExperimentalLibraryAbiReader to a publishable artifact
[`KT-76260`](https://youtrack.jetbrains.com/issue/KT-76260) Make `IrRichCallableReferencesInKlibs` lang feature stable in LV=2.3
[`KT-61552`](https://youtrack.jetbrains.com/issue/KT-61552) [PL] IndexOutOfBoundsException in SAM conversion with substituted function
[`KT-74417`](https://youtrack.jetbrains.com/issue/KT-74417) Deduce the metadata version based on LV in KLIB-based backends
[`KT-75980`](https://youtrack.jetbrains.com/issue/KT-75980) [Klib] Reduce serialized size of IrFileEntries for sparse usage of another source files
[`KT-73826`](https://youtrack.jetbrains.com/issue/KT-73826) Deduplicate `IrFileEntry` that is serialized inside `IrInlinedFunctionBlock`

### Language Design
[`KT-78866`](https://youtrack.jetbrains.com/issue/KT-78866) Show an error for implicit receiver shadowed by context parameter
[`KT-81015`](https://youtrack.jetbrains.com/issue/KT-81015) Stabilize nested type aliases
[`KT-32619`](https://youtrack.jetbrains.com/issue/KT-32619) JS: return Promise when `continuation` is not provided
[`KT-78976`](https://youtrack.jetbrains.com/issue/KT-78976) Decide if K2 should support local functions inside of local inline functions
[`KT-79308`](https://youtrack.jetbrains.com/issue/KT-79308) Ability to actualize empty interfaces as Any
[`KT-48872`](https://youtrack.jetbrains.com/issue/KT-48872) Provide modern and performant replacement for Enum.values()

### Libraries
[`KT-56822`](https://youtrack.jetbrains.com/issue/KT-56822) Deprecate Number.toChar() with error deprecation level
[`KT-79192`](https://youtrack.jetbrains.com/issue/KT-79192) Increase  InputStream.readBytes(Int) deprecation level to HIDDEN
[`KT-80778`](https://youtrack.jetbrains.com/issue/KT-80778) Stabilize kotlin.time.Clock and kotlin.time.Instant
[`KT-74411`](https://youtrack.jetbrains.com/issue/KT-74411) Introduce Uuid.generateV4() and generateV7()
[`KT-80619`](https://youtrack.jetbrains.com/issue/KT-80619) [KLIBs] Enable intra-module inliner in stdlib & kotlin-test
[`KT-76773`](https://youtrack.jetbrains.com/issue/KT-76773) stdlib: contextOf's type argument can be inferred via contextOf's context argument
[`KT-71822`](https://youtrack.jetbrains.com/issue/KT-71822) Intersection with (subtraction from) an identity set may produce incorrect results
[`KT-80605`](https://youtrack.jetbrains.com/issue/KT-80605) Rename MustUseReturnValue -> MustUseReturnValues
[`KT-69947`](https://youtrack.jetbrains.com/issue/KT-69947) KLIB stdlib: All intrinsics that can be used in KLIBs with inlined IR must be included in stdlib ABI dump
[`KT-59044`](https://youtrack.jetbrains.com/issue/KT-59044) Improve various aspects of TimeSource documentation
[`KT-78463`](https://youtrack.jetbrains.com/issue/KT-78463) Annotate wasm and JS targets of kotlin-stdlib with @IgnorableReturnValue when appropriate
[`KT-80544`](https://youtrack.jetbrains.com/issue/KT-80544) Mark controversial path extensions (like .deleteRecursively()) as ignorable
[`KT-80603`](https://youtrack.jetbrains.com/issue/KT-80603) K/N and K/Wasm: \p{N} category is not supported 
[`KT-80661`](https://youtrack.jetbrains.com/issue/KT-80661) ArrayDeque.lastIndexOf may return -1 for an element present in the deque
[`KT-80390`](https://youtrack.jetbrains.com/issue/KT-80390) ArrayDeque.indexOf(null) wrongly returns 0 after removals
[`KT-79094`](https://youtrack.jetbrains.com/issue/KT-79094) Change signature of assertFailsWith or make lambda excluded otherwise
[`KT-72028`](https://youtrack.jetbrains.com/issue/KT-72028) Incorrect parameters order in IndexedValue documentation
[`KT-80130`](https://youtrack.jetbrains.com/issue/KT-80130) [stdlib] Commonize AssociatedObjects in commonNonJvmMain
[`KT-80107`](https://youtrack.jetbrains.com/issue/KT-80107) [stdlib] Move CancellationException to commonNonJvmMain
[`KT-80179`](https://youtrack.jetbrains.com/issue/KT-80179) Investigate why StringBuilder.length is not enhanced automatically
[`KT-74444`](https://youtrack.jetbrains.com/issue/KT-74444) EnumEntries type should implement RandomAccess
[`KT-80046`](https://youtrack.jetbrains.com/issue/KT-80046) Increase test coverage of Duration.parse[IsoString][OrNull] methods
[`KT-76459`](https://youtrack.jetbrains.com/issue/KT-76459) Remove comments about sorting stability in unsigned-type arrays
[`KT-79489`](https://youtrack.jetbrains.com/issue/KT-79489) Generate Stdlib API reference for webMain source set
[`KT-78243`](https://youtrack.jetbrains.com/issue/KT-78243) Drop JS- and Wasm-specific IrLinkageError classes
[`KT-79108`](https://youtrack.jetbrains.com/issue/KT-79108) Remove the default argument for `linkageError` from kotlin.js.getPropertyCallableRef
[`KT-79130`](https://youtrack.jetbrains.com/issue/KT-79130) K/JS: Remove bodies from intrinsified Long methods
[`KT-78462`](https://youtrack.jetbrains.com/issue/KT-78462) Annotate kotlin-stdlib-jvm with @IgnorableReturnValue where appropriate
[`KT-79239`](https://youtrack.jetbrains.com/issue/KT-79239) K/Wasm: elementAt extension function of Array/PrimitiveArray/UnsignedArray does not throw IndexOutOfBoundException on incorrect index
[`KT-79256`](https://youtrack.jetbrains.com/issue/KT-79256) K/Wasm: MatchResult.groups raises a trap on invalid group index
[`KT-57317`](https://youtrack.jetbrains.com/issue/KT-57317) Repack EnumEntries from stdlib into the compiler

### Native
[`KT-80620`](https://youtrack.jetbrains.com/issue/KT-80620) Bump minimal iOS and tvOS supported versions to 14.0
[`KT-80624`](https://youtrack.jetbrains.com/issue/KT-80624) Bump minimal watchOS supported versions to 7.0
[`KT-79384`](https://youtrack.jetbrains.com/issue/KT-79384) K/N: Application Not Responding: Thread Deadlock
[`KT-80536`](https://youtrack.jetbrains.com/issue/KT-80536) Native: `DependencyDownloader` seems to have no timeout

### Native. Build Infrastructure
[`KT-80147`](https://youtrack.jetbrains.com/issue/KT-80147) Set proper LV and AV for `kotlin-native/performance/buildSrc`
[`KT-79474`](https://youtrack.jetbrains.com/issue/KT-79474) Kotlin/Native: fix breakpad build
[`KT-79215`](https://youtrack.jetbrains.com/issue/KT-79215) Kotlin/Native: fix distInvalidateStaleCaches on windows

### Native. C and ObjC Import
[`KT-79752`](https://youtrack.jetbrains.com/issue/KT-79752) Native: make cinterop generate CCall.Direct annotations
[`KT-79753`](https://youtrack.jetbrains.com/issue/KT-79753) Native: support CCall.Direct calls in the compiler
[`KT-79571`](https://youtrack.jetbrains.com/issue/KT-79571) Xcode 26 beta 4: CInteropKT39120TestGenerated.testForwardEnum failed
[`KT-80838`](https://youtrack.jetbrains.com/issue/KT-80838) Cinterop fails with an error when Compilation works fine
[`KT-49034`](https://youtrack.jetbrains.com/issue/KT-49034) Kotlin/Native: `cnames.structs.Foo` resolves into wrong declaration

### Native. ObjC Export
[`KT-78810`](https://youtrack.jetbrains.com/issue/KT-78810) [ObjCExport] Enable explicit ObjC block parameter names by default
[`KT-80271`](https://youtrack.jetbrains.com/issue/KT-80271) ObjC/Swift Export: Remove Native platform `Cloneable` checks
[`KT-78604`](https://youtrack.jetbrains.com/issue/KT-78604) Consider not inheriting `KlibScope` from `KaScope`
[`KT-79767`](https://youtrack.jetbrains.com/issue/KT-79767) ObjCExport: private companion must not be exposed
[`KT-79724`](https://youtrack.jetbrains.com/issue/KT-79724) ObjCExport: extensions order
[`KT-79548`](https://youtrack.jetbrains.com/issue/KT-79548) ObjCExport: mangling difference between K1 and K2 when translating KotlinDurationCompanion
[`KT-79475`](https://youtrack.jetbrains.com/issue/KT-79475) ObjCExport: invalid property getter translation
[`KT-79346`](https://youtrack.jetbrains.com/issue/KT-79346) ObjCExport: Any method overrides
[`KT-78871`](https://youtrack.jetbrains.com/issue/KT-78871) ObjCExport: translation of keyword `release` with parameter generates invalid header

### Native. Runtime. Memory
[`KT-75918`](https://youtrack.jetbrains.com/issue/KT-75918) Native: Deprecate -Xallocator=std
[`KT-80678`](https://youtrack.jetbrains.com/issue/KT-80678) Native: pagedAllocator=false sweep is slow
[`KT-75916`](https://youtrack.jetbrains.com/issue/KT-75916) Native: Enable sanitizer support with pagedAllocator=false

### Native. Swift Export
[`KT-80111`](https://youtrack.jetbrains.com/issue/KT-80111) Swift Export Build Fails Due to Errors in KotlinStdlib.swift
[`KT-80884`](https://youtrack.jetbrains.com/issue/KT-80884) Swift Export: support async in SIR
[`KT-80185`](https://youtrack.jetbrains.com/issue/KT-80185) Swift Export: IllegalArgumentException – Collection contains more than one matching element
[`KT-79889`](https://youtrack.jetbrains.com/issue/KT-79889) K/N: swift-export fails under several different conditions
[`KT-79518`](https://youtrack.jetbrains.com/issue/KT-79518) Swift export: represent kotlin.Any as swift.any
[`KT-78603`](https://youtrack.jetbrains.com/issue/KT-78603) Do not inherit SirAndKaSession from KaSession
[`KT-79227`](https://youtrack.jetbrains.com/issue/KT-79227) Swift Export: Fix First Release Issues
[`KT-79521`](https://youtrack.jetbrains.com/issue/KT-79521) '_CoroutineScope' is inaccessible due to 'internal' protection level
[`KT-79181`](https://youtrack.jetbrains.com/issue/KT-79181) Swift Export Fails When Using T: Comparable<T> Generic Constraint in Kotlin Classes

### Native. Testing
[`KT-79242`](https://youtrack.jetbrains.com/issue/KT-79242) [K/N] Drop K1-specific tests, testrunners and test directives
[`KT-79393`](https://youtrack.jetbrains.com/issue/KT-79393) Make :native:native.tests:codegen-box:test cacheable
[`KT-80468`](https://youtrack.jetbrains.com/issue/KT-80468) K/N execution timeout Compiler Tests K2 (for bundle) opt.opt/cache.no/GC.CMS (Native, Linux x86_64)
[`KT-78670`](https://youtrack.jetbrains.com/issue/KT-78670) Native: Randomized GC fuzzing DSL generator
[`KT-80205`](https://youtrack.jetbrains.com/issue/KT-80205) Swift export tests fail against Xcode 26

### Test Infrastructure
[`KT-79665`](https://youtrack.jetbrains.com/issue/KT-79665) [Tests] make `// WITH_COROUTINES` work correctly for non-jvm multi-module tests
[`KT-80128`](https://youtrack.jetbrains.com/issue/KT-80128) Compiler plugin test framework: DUMP_SOURCE_RANGES_IR and FIR_DUMP use conflicting file name
[`KT-79903`](https://youtrack.jetbrains.com/issue/KT-79903) [JS] Add CLI tests for performance reports in 2ns stage
[`KT-79657`](https://youtrack.jetbrains.com/issue/KT-79657) Add a directive to disable TagsGeneratorChecker in tests
[`KT-79247`](https://youtrack.jetbrains.com/issue/KT-79247) [CommonBE] Drop K1-specific tests, testrunners and test directives

### Tools. Ant
[`KT-75875`](https://youtrack.jetbrains.com/issue/KT-75875) Remove Ant support

### Tools. BCV
[`KT-80313`](https://youtrack.jetbrains.com/issue/KT-80313) Add ability to generate dump from jar files [ABI Tools]

### Tools. Build Tools API
[`KT-81321`](https://youtrack.jetbrains.com/issue/KT-81321) Deprecate old BTA prototype API
[`KT-79409`](https://youtrack.jetbrains.com/issue/KT-79409) BTA: Support removed compiler arguments properly
[`KT-78194`](https://youtrack.jetbrains.com/issue/KT-78194) BTA: port the JVM prototype to the new design
[`KT-75356`](https://youtrack.jetbrains.com/issue/KT-75356) Failing to pass a `-d` argument causes Build Tools API to NPE
[`KT-78193`](https://youtrack.jetbrains.com/issue/KT-78193) BTA: Implement core infrastructure according to the new design
[`KT-81130`](https://youtrack.jetbrains.com/issue/KT-81130) BTA: using KotlinVersion from stdlib in the API breaks when using isolated classloader
[`KT-78196`](https://youtrack.jetbrains.com/issue/KT-78196) BTA: implement API adapter for the prototype implementation
[`KT-77999`](https://youtrack.jetbrains.com/issue/KT-77999) BTA: Generate BTA options from compiler arguments descriptions
[`KT-78195`](https://youtrack.jetbrains.com/issue/KT-78195) BTA: migrate the test infrastructure from the prototype to the new design

### Tools. CLI
[`KT-79867`](https://youtrack.jetbrains.com/issue/KT-79867) CompilerConfiguration.configureSourceRoots puts obfuscated file paths instead of ones passed on `classpath` to CLIConfigurationKeys.CONTENT_ROOTS
[`KT-80348`](https://youtrack.jetbrains.com/issue/KT-80348) Expose 'XXLanguage' compiler argument as a normal argument
[`KT-80428`](https://youtrack.jetbrains.com/issue/KT-80428) KMP Separate Compilation: Handle friend dependencies
[`KT-74590`](https://youtrack.jetbrains.com/issue/KT-74590) Deprecate -Xjvm-default in favor of -jvm-default
[`KT-80349`](https://youtrack.jetbrains.com/issue/KT-80349) KMP Separate Compilation is enabled on non-KMP compilations
[`KT-79982`](https://youtrack.jetbrains.com/issue/KT-79982) Fix description of -Xjspecify-annotations
[`KT-79403`](https://youtrack.jetbrains.com/issue/KT-79403) Improve generator for deprecated CLI arguments
[`KT-75968`](https://youtrack.jetbrains.com/issue/KT-75968) Set proper lifecycle for all existing compiler arguments
[`KT-79293`](https://youtrack.jetbrains.com/issue/KT-79293) Create Language Features and compiler argument with parameter for new destructuring features 

### Tools. Commonizer
[`KT-49735`](https://youtrack.jetbrains.com/issue/KT-49735) [Commonizer] :commonizeNativeDistribution  fails for projects with two or more same native targets
[`KT-47523`](https://youtrack.jetbrains.com/issue/KT-47523) MPP: Unable to resolve c-interop dependency if platform is included in an intermediate source set with the only target
[`KT-48118`](https://youtrack.jetbrains.com/issue/KT-48118) Commonized c-interop lib is not attached to common main source set
[`KT-46248`](https://youtrack.jetbrains.com/issue/KT-46248) MPP: Compile KotlinMetadata fails with Unresolved reference if only one native platform from shared source set is available

### Tools. Compiler Plugin API
[`KT-55300`](https://youtrack.jetbrains.com/issue/KT-55300) Provide a mechanism to describe ordering and dependencies for compiler plugins
[`KT-74867`](https://youtrack.jetbrains.com/issue/KT-74867) LLFirIdePredicateBasedProvider matches local classes when it shouldn't
[`KT-52665`](https://youtrack.jetbrains.com/issue/KT-52665) Deprecate `ComponentRegistrar`
[`KT-75865`](https://youtrack.jetbrains.com/issue/KT-75865) Provide an API for setting the file name for the file with top-level declarations generated by a plugin

### Tools. Compiler Plugins
[`KT-79319`](https://youtrack.jetbrains.com/issue/KT-79319) Lombok: NullPointerException on `mvn compile` when importing Java constants
[`KT-80815`](https://youtrack.jetbrains.com/issue/KT-80815) NoArg compiler plugin: Promote NO_NOARG_CONSTRUCTOR_IN_SUPERCLASS diagnostic from warning to error
[`KT-80822`](https://youtrack.jetbrains.com/issue/KT-80822) False positive NO_NOARG_CONSTRUCTOR_IN_SUPERCLASS reported for a class with explicit noargs  constructor already present
[`KT-53122`](https://youtrack.jetbrains.com/issue/KT-53122) Constructors generated with NoArg have no @Metadata and are invisible for the frontend
[`KT-74687`](https://youtrack.jetbrains.com/issue/KT-74687)  Kotlin Lombok: False positive when calling builder on Java record
[`KT-80419`](https://youtrack.jetbrains.com/issue/KT-80419) Remove bundled jetbrains annotations from kotlin-dataframe-compiler-plugin
[`KT-79245`](https://youtrack.jetbrains.com/issue/KT-79245) [AtomicFU] Drop K1/JS- and K1/Native-specific testrunners
[`KT-79197`](https://youtrack.jetbrains.com/issue/KT-79197) DataFrame: Cannot find local variable 'this@df' with type Scope0 
[`KT-73865`](https://youtrack.jetbrains.com/issue/KT-73865) Incorrect type is generated for irPropertyReference during K/N transformation

### Tools. Compiler plugins. Serialization
[`KT-70345`](https://youtrack.jetbrains.com/issue/KT-70345) Promote COMPANION_OBJECT_IS_SERIALIZABLE_INSIDE_SERIALIZABLE_CLASS diagnostic to error
[`KT-79695`](https://youtrack.jetbrains.com/issue/KT-79695) Serialization does not exclude field-less properties in 2.2.20-Beta2
[`KT-79246`](https://youtrack.jetbrains.com/issue/KT-79246) [Serialization] Drop K1-specific testrunners

### Tools. Gradle
[`KT-79238`](https://youtrack.jetbrains.com/issue/KT-79238) Bump minimal supported AGP version to 8.2.2
[`KT-76720`](https://youtrack.jetbrains.com/issue/KT-76720) Raise deprecation level to error for Kotlin*Options properties
[`KT-78199`](https://youtrack.jetbrains.com/issue/KT-78199) Gradle: Migrate JVM compilation in KGP to the new BTA
[`KT-81415`](https://youtrack.jetbrains.com/issue/KT-81415) BTA: Duplicate daemons when compiling JVM + JS in KGP
[`KT-80763`](https://youtrack.jetbrains.com/issue/KT-80763) Add redirect link to error message when 'org.jetbrains.kotlin.android' plugin is used with built-in Kotlin
[`KT-81038`](https://youtrack.jetbrains.com/issue/KT-81038) Gradle: remove support for properties disabling precise task outputs backup
[`KT-80808`](https://youtrack.jetbrains.com/issue/KT-80808) Warning from kotlin-dsl with kotlin("jvm") on Gradle < 9.0 doesn’t suggest updating Gradle
[`KT-80875`](https://youtrack.jetbrains.com/issue/KT-80875) Gradle: runToolInSeparateProcess may fail on Windows with too long command line
[`KT-79851`](https://youtrack.jetbrains.com/issue/KT-79851) Emit an actionable warning/error on unsupported AV/LV configured by `kotlin-dsl`
[`KT-77458`](https://youtrack.jetbrains.com/issue/KT-77458) Run Gradle integration tests against Gradle 9.0
[`KT-80172`](https://youtrack.jetbrains.com/issue/KT-80172) Error message changes depending on the order of applying 'org.jetbrains.kotlin.android' and 'AGP' 9.0+ with built-in Kotlin plugin
[`KT-76177`](https://youtrack.jetbrains.com/issue/KT-76177) Remove deprecated classpath snapshot task inputs
[`KT-79339`](https://youtrack.jetbrains.com/issue/KT-79339) Remove additionalMetadata from compiler options DSL 
[`KT-73478`](https://youtrack.jetbrains.com/issue/KT-73478) Add module level description
[`KT-80083`](https://youtrack.jetbrains.com/issue/KT-80083) KGP IT: fix tests on Windows
[`KT-79034`](https://youtrack.jetbrains.com/issue/KT-79034) Automatically disable cross compilation if it's not supported on the host
[`KT-79408`](https://youtrack.jetbrains.com/issue/KT-79408) A lot of errors files are created when compile Kotlin
[`KT-78827`](https://youtrack.jetbrains.com/issue/KT-78827) Rewrite Gradle compiler options DSL generator

### Tools. Gradle. BCV
[`KT-80621`](https://youtrack.jetbrains.com/issue/KT-80621) Move Gradle tasks into suitable groups [ABI Validation]
[`KT-78625`](https://youtrack.jetbrains.com/issue/KT-78625) Kotlin's built-in BCV generates empty .api files

### Tools. Gradle. JS
[`KT-79921`](https://youtrack.jetbrains.com/issue/KT-79921) Web Tooling Gradle API does not respect webpack reconfiguration
[`KT-79910`](https://youtrack.jetbrains.com/issue/KT-79910) Wasm, JS: Upgrade NPM versions
[`KT-76996`](https://youtrack.jetbrains.com/issue/KT-76996) Wasm: js tasks triggers wasm subtasks
[`KT-79237`](https://youtrack.jetbrains.com/issue/KT-79237) Upgrade NPM dependencies versions

### Tools. Gradle. Multiplatform
[`KT-61127`](https://youtrack.jetbrains.com/issue/KT-61127) Remove scoped resolvable and intransitive DependenciesMetadata configurations used in the pre-IdeMultiplatformImport IDE import
[`KT-74005`](https://youtrack.jetbrains.com/issue/KT-74005) Implement a prototype of Unified Klib support in Kotlin Gradle Plugin
[`KT-80785`](https://youtrack.jetbrains.com/issue/KT-80785) With `android.builtInKotlin=false` and `android.newDsl=true`, using `kotlin-android` plugin will fail with `ClassCastException`
[`KT-62614`](https://youtrack.jetbrains.com/issue/KT-62614) Remove legacy kotlin-gradle-plugin-model
[`KT-76446`](https://youtrack.jetbrains.com/issue/KT-76446) Add kotlin-level dependency block to work the same way as commonMain/commonTest dependencies blocks
[`KT-79559`](https://youtrack.jetbrains.com/issue/KT-79559) AGP complains about configurations resolved at configuration time due to KMP partially resolved dependencies diagnostic
[`KT-78993`](https://youtrack.jetbrains.com/issue/KT-78993) The value for property '*' property 'dependencies' is final and cannot be changed any further
[`KT-76200`](https://youtrack.jetbrains.com/issue/KT-76200) TestModuleProperties.productionModuleName for JVM module isn't present with 2.1.20-RC 
[`KT-55312`](https://youtrack.jetbrains.com/issue/KT-55312) Replace "ALL_COMPILE_DEPENDENCIES_METADATA" configuration with set of metadata dependencies configurations associated per set
[`KT-52216`](https://youtrack.jetbrains.com/issue/KT-52216) HMPP / KTOR: False positive "TYPE_MISMATCH" with Throwable descendant
[`KT-54312`](https://youtrack.jetbrains.com/issue/KT-54312) TCS: Replace CompilationDetails abstract class hierarchy by composable implementation
[`KT-55230`](https://youtrack.jetbrains.com/issue/KT-55230) Remove metadata dependencies transformation for runtimeOnly scope

### Tools. Gradle. Native
[`KT-80675`](https://youtrack.jetbrains.com/issue/KT-80675) Commonized cinterops between "test" compilations produce an import failure
[`KT-64107`](https://youtrack.jetbrains.com/issue/KT-64107) Kotlin Gradle plugin allows native binaries to have both `debuggable` and `optimized` flags set to `true`
[`KT-74910`](https://youtrack.jetbrains.com/issue/KT-74910) Bump `destinationDir` in CInteropProcess to hidden
[`KT-74911`](https://youtrack.jetbrains.com/issue/KT-74911) Promote CInteropProcess.konanVersion to hidden
[`KT-74864`](https://youtrack.jetbrains.com/issue/KT-74864) Enable exporting KDocs by default to ObjC
[`KT-72705`](https://youtrack.jetbrains.com/issue/KT-72705) K/N: compile task cache can not be used due to 'artifactVersion' input property

### Tools. Gradle. Swift Export
[`KT-79524`](https://youtrack.jetbrains.com/issue/KT-79524) NoSuchMethodError: 'java.lang.String org.gradle.api.artifacts.ProjectDependency.getPath() for swift export with dependency export fro gradle < 8.11

### Tools. Incremental Compile
[`KT-75864`](https://youtrack.jetbrains.com/issue/KT-75864) Implement a conservative mechanism of the IC with compiler plugins generated top-level declarations
[`KT-79504`](https://youtrack.jetbrains.com/issue/KT-79504) Implement an API to provide IC lookups from backend plugins
[`KT-55982`](https://youtrack.jetbrains.com/issue/KT-55982) K2: Consider global lookups from plugins in incremental compilation
[`KT-75657`](https://youtrack.jetbrains.com/issue/KT-75657) Fix difference in incremental compilation scenarios in BTA in-process vs daemon compilation mode
[`KT-79541`](https://youtrack.jetbrains.com/issue/KT-79541) Refactor tracking of files relation in IC
[`KT-74628`](https://youtrack.jetbrains.com/issue/KT-74628) Incremental compilation runner does not check compiler exit code before mapping sources to classes

### Tools. JPS
[`KT-77347`](https://youtrack.jetbrains.com/issue/KT-77347) Support file-less compatible IC approach

### Tools. Kapt
[`KT-73411`](https://youtrack.jetbrains.com/issue/KT-73411) Remove `kapt.use.k2` property and code which allows to use K2 with K1 kapt
[`KT-79138`](https://youtrack.jetbrains.com/issue/KT-79138) K2: KAPT Java Stub Gen: `Unresolved reference` with @kotlin.Metadata in Java in 2.2.0 
[`KT-79641`](https://youtrack.jetbrains.com/issue/KT-79641) Kapt: too much information is printed in verbose mode
[`KT-79305`](https://youtrack.jetbrains.com/issue/KT-79305) K2 kapt: ISE "Cannot evaluate IR expression in annotation" on typealias with unresolved expansion
[`KT-79136`](https://youtrack.jetbrains.com/issue/KT-79136) K2 kapt: unresolved nested class references in annotation arguments are generated without outer class names
[`KT-79133`](https://youtrack.jetbrains.com/issue/KT-79133) K2 kapt: class literal with typealias is not expanded

### Tools. Maven
[`KT-81218`](https://youtrack.jetbrains.com/issue/KT-81218) Kotlin Maven Plugin 2.2.20: Java classes not resolved with enabled incremental compilation without daemon

### Tools. Performance benchmarks
[`KT-79709`](https://youtrack.jetbrains.com/issue/KT-79709) Add `-Xdetailed-perf` CLI flag to control verbosity of performance logs
[`KT-79226`](https://youtrack.jetbrains.com/issue/KT-79226) [K/N] Add performance measurement for native backend lowerings 

### Tools. Statistics (FUS)
[`KT-77407`](https://youtrack.jetbrains.com/issue/KT-77407) Add performance measurement for prefix lowerings 
[`KT-79455`](https://youtrack.jetbrains.com/issue/KT-79455) [FUS] Collect KSP plugin version
[`KT-79090`](https://youtrack.jetbrains.com/issue/KT-79090) Integrate dynamic stats into `MarkdownReportRenderer`

### Tools. Wasm
[`KT-80582`](https://youtrack.jetbrains.com/issue/KT-80582) Multiple reloads when using webpack dev server after 2.2.20-Beta2
[`KT-80896`](https://youtrack.jetbrains.com/issue/KT-80896) K/Wasm: debug tests only once
[`KT-78921`](https://youtrack.jetbrains.com/issue/KT-78921) K/Wasm: don't generate empty yarn.lock file
