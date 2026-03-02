/*
    Variables
    - A variable is a name assigned to a value in the program. Serves as an identifier to what context the variable represents/stores.
    - The Rust compiler will provide a warning for any unused variables.
    - The Rust compiler will also infer the type of the variable based on the value stored (if not explicitly specified by the developer).
    - We can declare unused variables by prepending the variable name with an underscore. This is so that the Rust compiler does not generate unused variable warnings.

    Interpolation
    - We can print variables to the terminal using the println!() macro, by placing String literals in "" and interpolating variables by using {}. After ending our String, we can pass variable names as arguments for each pair of curly braces. We can also pass variable names directly within the {} and not pass variable names as arguments to println!().

    Positional arguments to println!()
    - When we pass positional arguments to the println!() macro, Rust assigns numerical correlations/indices to each starting from 0.

    Mutability & immutability
    - Variables are immutable by default. This means they are incapable of change. Mutable means capable of change.
    - The mut keyword allows a variable to be mutable (or changed in the lifetime of the program).

    Rust error codes

    Variable shadowing

    Scopes & blocks

    Constants

    Type aliases

    Compiler directives
*/

fn main() {
    println!("\nVariables, Data Types, Mutability in Rust programming!");

    let lines_of_code: i32 = 253;
    println!("\nlines_of_code = {}", lines_of_code);
    let more_lines_of_code: i32 = 173;
    println!("more_lines_of_code = {}", more_lines_of_code);
    let total_lines_of_code = lines_of_code + more_lines_of_code;
    println!("total_lines_of_code = {} + {} = {}", lines_of_code, more_lines_of_code, total_lines_of_code);

    let a = 3;
    let b = 1;
    let c = 2; 
    println!("\n{1}, {2}, {0}", a, b, c);

    let _unused_var = 7;

    let mut tax_rate: f32 = 1.2573;
    println!("\ntax_rate: {}", tax_rate);
    tax_rate = 1.47892;
    println!("tax_rate: {}", tax_rate);
}