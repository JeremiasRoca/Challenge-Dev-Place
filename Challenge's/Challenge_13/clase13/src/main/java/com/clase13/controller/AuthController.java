
@RestController
@RequestMapping("/users/auth")
public class AuthController{

    @Autowired
    PasswordEncoder encoder;



    @PostMapping("/login")
    public ResponseEntity<?> auth(@Valid @RequestBody LoginRequest loginResquest){

    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody User user){
        if(userRepository.existByDni(user.getDni())){
            return ResponseEntity.badRequest().body(new MenssageResponse("Error")) ;
        }
        if(userRepository.existByEmail(user.getEmail())){
            return ResponseEntity.badRequest().body(new MenssageResponse("Error")) ;
        }

    }

}