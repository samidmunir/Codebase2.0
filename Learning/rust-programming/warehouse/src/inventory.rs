pub const FLOOR_SPACE: i32 = 10000;
pub const MANAGER: &str = "Sami M.";

#[derive(Debug)]
enum ProductCategory {
    Ladder,
    Hammer,
}

#[derive(Debug)]
struct Item {
    name: String,
    category: ProductCategory,
    quantity: u32,
}

pub fn talk_to_manager() {
    println!("\ninventory.talk_to_manager() called...");
    println!("- Hey, {MANAGER}, how was your coffee?");
}