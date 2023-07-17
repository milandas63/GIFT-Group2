Day-09 (17-07-2023)
-------------------
    =   Exception Handling
        >   Exception handling is a fault resistance technique in Java
        >   The statement try is used for exception handling. The try block
            is associated with 2 clauses. The two clauses are catch and finally.
        >   The program is written within the try block. When an exception occurs,
            an exception object is generated and the following lines of code is
            ignored.
        >   The exception object is matched with the catch clauses in sequence from
            top to bottom. Which catch clause is matched, the exception object is
            stored in the variable of that catch clause, and the corresponding block
            is executed.

    =   What is an exception class?
        Any class that inherits the Throwable class is treated as an exception class.

    =   There are 2 types of exceptions:
        1)  Checked exception
            a)  It checks for those exceptions that are enlisted in the catch clause
                and the exception is generated from the try block
            b)  If an exception is generated from try and is not enlisted in the
                catch clause
        2)  Unchecked exception
            No such checking by the compiler

    java.lang.Object
    +-  Throwable
    |   +-  Exception 
    |   |   +-  AclNotFoundException
    |   |   +-  ActivationException
    |   |   |   +-  UnknownGroupException
    |   |   |   +-  UnknownObjectException
    |   |   +-  AlreadyBoundException
    |   |   +-  ApplicationException
    |   |   +-  AWTException
    |   |   +-  BackingStoreException
    |   |   +-  BadAttributeValueExpException
    |   |   +-  BadBinaryOpValueExpException
    |   |   +-  BadLocationException
    |   |   +-  BadStringOperationException
    |   |   +-  BrokenBarrierException
    |   |   +-  CertificateException
    |   |   |   +-  CertificateEncodingException
    |   |   |   +-  CertificateExpiredException
    |   |   |   +-  CertificateNotYetValidException
    |   |   |   +-  CertificateParsingException
    |   |   +-  CloneNotSupportedException
    |   |   +-  DataFormatException
    |   |   +-  DatatypeConfigurationException
    |   |   +-  DestroyFailedException
    |   |   +-  ExecutionException
    |   |   +-  ExpandVetoException
    |   |   +-  FontFormatException
    |   |   +-  GeneralSecurityException
    |   |   +-  GSSException
    |   |   +-  IllegalClassFormatException
    |   |   +-  InterruptedException
    |   |   +-  IntrospectionException
    |   |   +-  InvalidApplicationException
    |   |   +-  InvalidMidiDataException
    |   |   +-  InvalidPreferencesFormatException
    |   |   +-  InvalidTargetObjectTypeException
    |   |   +-  IOException
    |   |   +-  JAXBException
    |   |   +-  JMException
    |   |   +-  KeySelectorException
    |   |   +-  LambdaConversionException
    |   |   +-  LastOwnerException
    |   |   +-  LineUnavailableException
    |   |   +-  MarshalException
    |   |   +-  MidiUnavailableException
    |   |   +-  MimeTypeParseException
    |   |   +-  MimeTypeParseException
    |   |   +-  NamingException
    |   |   +-  NoninvertibleTransformException
    |   |   +-  NotBoundException
    |   |   +-  NotOwnerException
    |   |   +-  ParseException
    |   |   +-  ParserConfigurationException
    |   |   +-  PrinterException
    |   |   +-  PrintException
    |   |   +-  PrivilegedActionException
    |   |   +-  PropertyVetoException
    |   |   +-  ReflectiveOperationException
    |   |   +-  RefreshFailedException
    |   |   +-  RemarshalException
    |   |   +-  RuntimeException
    |   |   |   +-  AnnotationTypeMismatchException
    |   |   |   +-  ArithmeticException
    |   |   |   +-  ArrayStoreException
    |   |   |   +-  BufferOverflowException
    |   |   |   +-  BufferUnderflowException
    |   |   |   +-  CannotRedoException
    |   |   |   +-  CannotUndoException
    |   |   |   +-  ClassCastException
    |   |   |   +-  CMMException
    |   |   |   +-  CompletionException
    |   |   |   +-  ConcurrentModificationException
    |   |   |   +-  DataBindingException
    |   |   |   +-  DateTimeException
    |   |   |   +-  DOMException
    |   |   |   +-  EmptyStackException
    |   |   |   +-  EnumConstantNotPresentException
    |   |   |   +-  EventException
    |   |   |   +-  FileSystemAlreadyExistsException
    |   |   |   +-  FileSystemNotFoundException
    |   |   |   +-  IllegalArgumentException
    |   |   |   |   +-  IllegalChannelGroupException
    |   |   |   |   +-  IllegalCharsetNameException
    |   |   |   |   +-  IllegalFormatException
    |   |   |   |   +-  IllegalSelectorException
    |   |   |   |   +-  IllegalThreadStateException
    |   |   |   |   +-  InvalidKeyException
    |   |   |   |   +-  InvalidOpenTypeException
    |   |   |   |   +-  InvalidParameterException
    |   |   |   |   +-  InvalidPathException
    |   |   |   |   +-  KeyAlreadyExistsException
    |   |   |   |   +-  NumberFormatException
    |   |   |   |   +-  PatternSyntaxException
    |   |   |   |   +-  ProviderMismatchException
    |   |   |   |   +-  UnresolvedAddressException
    |   |   |   |   +-  UnsupportedAddressTypeException
    |   |   |   |   +-  UnsupportedCharsetException
    |   |   |   +-  IllegalMonitorStateException
    |   |   |   +-  IllegalPathStateException
    |   |   |   +-  IllegalStateException
    |   |   |   +-  IllformedLocaleException
    |   |   |   +-  ImagingOpException
    |   |   |   +-  IncompleteAnnotationException
    |   |   |   +-  IndexOutOfBoundsException
    |   |   |   +-  JMRuntimeException
    |   |   |   +-  LSException
    |   |   |   +-  MalformedParameterizedTypeException
    |   |   |   +-  MalformedParametersException
    |   |   |   +-  MirroredTypesException
    |   |   |   +-  MissingResourceException
    |   |   |   +-  NegativeArraySizeException
    |   |   |   +-  NoSuchElementException
    |   |   |   +-  NoSuchMechanismException
    |   |   |   +-  NullPointerException
    |   |   |   +-  ProfileDataException
    |   |   |   +-  ProviderException
    |   |   |   +-  ProviderNotFoundException
    |   |   |   +-  RasterFormatException
    |   |   |   +-  RejectedExecutionException
    |   |   |   +-  SecurityException
    |   |   |   +-  SystemException
    |   |   |   +-  TypeConstraintException
    |   |   |   +-  TypeNotPresentException, UncheckedIOException, UndeclaredThrowableException, UnknownEntityException, UnmodifiableSetException, UnsupportedOperationException, WebServiceException, WrongMethodTypeException

    |   |   +-  SAXException
    |   |   +-  ScriptException
    |   |   +-  ServerNotActiveException
    |   |   +-  SOAPException
    |   |   +-  SQLException
    |   |   +-  TimeoutException
    |   |   +-  TooManyListenersException
    |   |   +-  TransformerException
    |   |   +-  TransformException
    |   |   +-  UnmodifiableClassException
    |   |   +-  UnsupportedAudioFileException
    |   |   +-  UnsupportedCallbackException
    |   |   +-  UnsupportedFlavorException
    |   |   +-  UnsupportedLookAndFeelException
    |   |   +-  URIReferenceException
    |   |   +-  URISyntaxException
    |   |   +-  UserException
    |   |   +-  XAException
    |   |   +-  XMLParseException
    |   |   +-  XMLSignatureException
    |   |   +-  XMLStreamException
    |   |   +-  XPathException
    |   +-  Error

        try {
            ....
            double x = 25/0;
            ....
            ....
            ....
        } catch(NumberFormatException e) {
        } catch(StringIndexOutOfBoundsException e) {
        } catch(ArithmeticException e) {
            System.err.println(e);
        } catch(IndexOutOfBoundsException e) {
        }

    =   CASE STUDY
        Write a program to print the voter id card of citizens who are eligible to
        vote. The country for which you are writing this program has a rule, 
        citizens less than 18 years and greater than 90 years can't vote.

            >=18 and <=90 are eligible
            <18 not eligible
            >90 not eligible

        Object
        +- Throwable
        |  +- Exception
        |  |  +- AgeException
        |  |  |  +- WrongAgeException
        |  |  |  |  +- TooYoungAgeException
        |  |  |  |  +- TooOldAgeException
        |  |  |  +- InvalidAgeException
        |  |  |  |  +- NegativeAgeException
        |  |  |  |  +- ZeroAgeException

        int[] ages = {36, 25, 11, 47, 61, -19, 77, 93, 0, 72, 12, 15, 84};

    =   CLASSWORK
        Write a program to check for the valid username and password using the following
        user defined classes:

            Object
            +- Throwable
            |  +- Exception
            |  |  +- UserException
            |  |  |  +- WrongUserException
            |  |  |  |  +- WrongUsernameException
            |  |  |  |  +- WrongPasswordException
            |  |  |  +- InvalidUserException
            |  |  |  |  +- EmptyUsernameException
            |  |  |  |  +- EmptyPasswordException

        String[] users { {"Teacher","milan"}, {"Gift","college"}, {"Language","java"},
                         {"Animal","tiger"}, {"Student","gift"}, {"Session","second"} }; 


