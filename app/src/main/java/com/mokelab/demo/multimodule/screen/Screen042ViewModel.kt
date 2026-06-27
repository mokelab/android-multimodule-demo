package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data411RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data412RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data413RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data414RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data415RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data416RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data417RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data418RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data419RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data420RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen042ViewModel @Inject constructor(
    private val repo1: Data411RepositoryImpl,
    private val repo2: Data412RepositoryImpl,
    private val repo3: Data413RepositoryImpl,
    private val repo4: Data414RepositoryImpl,
    private val repo5: Data415RepositoryImpl,
    private val repo6: Data416RepositoryImpl,
    private val repo7: Data417RepositoryImpl,
    private val repo8: Data418RepositoryImpl,
    private val repo9: Data419RepositoryImpl,
    private val repo10: Data420RepositoryImpl,

): ViewModel() {
}
